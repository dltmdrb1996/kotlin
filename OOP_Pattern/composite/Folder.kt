package composite

class Folder(private val name: String) : FileSystem{
    private val folding = ArrayList<FileSystem>()

    fun add(fileSystem: FileSystem){
        folding.add(fileSystem)
    }

    override fun getSize(): Int {
        var total = 0
        for(file in folding){
            total += file.getSize()
        }
        println("$name 폴더 크기 $total")
        println("=====================")
        return total
    }

    override fun remove() {
        for(file in folding){
            file.remove()
        }
        println("$name 폴더 삭제")
        println("=====================")

    }



}