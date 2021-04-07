fun main(){
    var a = listOf<String>("딸기","사과","배")

    println(a[2])
    for(i in a){
        println(i)
    }

    println()

    val b = mutableListOf(5,4,3)
    b.add(6)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}