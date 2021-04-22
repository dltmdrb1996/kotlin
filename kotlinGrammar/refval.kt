var x = 1024

fun main(args: Array<String>) {
    println(::x.get())
    println(::x.name)

    val numList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("홀수값 : ${numList.filter(::isOdd)}")
    println("짝수값 : ${numList.filter(::isEven)}")


    var tempList = numList.filter { x: Int ->
        if(x % 2 == 0) true else false
    }
    for(num in tempList)
    println("짝수값 : ${num}")

}
fun isOdd(x: Int): Boolean {
    return x % 2 != 0
}

fun isEven(x: Int): Boolean {
    return x % 2 == 0
}