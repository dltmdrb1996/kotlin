package composite

interface FileSystem{
    fun getSize() : Int
    fun remove()
}

class File(private val name : String ,private val fileSize : Int) : FileSystem{

    override fun getSize(): Int {
        println("$name 의 파일크기 $fileSize")
        return fileSize
    }

    override fun remove() {
        println("$name 파일 삭제")
    }
}

