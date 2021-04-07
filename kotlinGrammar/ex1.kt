fun main() {
    println("hello world")

    var arrint = arrayOfNulls<Int>(5)

    arrint = arrayOf(3, 4, 5, 6)

    print(arrint[3])

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add2(a: Int, b: Int) = a + b

    println(add(3, 4))
    println(add2(3, 4))

    var multiIntArray: Array<Array<Int>> = Array<Array<Int>>(3) { arrayOf(1, 2, 3) }
    for (intArray in multiIntArray) {
        for (int in intArray) {
            print("$int ")
        }
        println()
    }

    var arrEx = arrayOfNulls<Array<Int>>(3)

    arrEx[0] = arrayOf(1,2,3,4)
    arrEx[1] = arrayOf(1,2,3)
    arrEx[2] = arrayOf(1,2)

    for(intarray in arrEx){
        if (intarray != null) {
            for(index in intarray){
                print("$index ")
            }
            println()
        }
    }


}