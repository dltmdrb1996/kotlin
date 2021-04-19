fun main() {
    //생략되지 않은 전체 표현
    val multi1: (Int, Int) -> Int = { x: Int, y: Int -> x * y }

// 선언 자료형 생략
    val multi2 = { x: Int, y: Int -> x * y }

//람다식 매개변수 자료형의 생략
    val multi3: (Int, Int) -> Int = { x, y -> x * y }


    val nestedLambda: () -> () -> Unit = { { println("nested") } }
    nestedLambda()()

    val square: (Int) -> Int = { x -> x * x }
    println(square(3))

    val result1 = highOrder({ x, y -> x + y }, 10, 20)
    println(result1)


    val lambda: () -> Boolean = { // 람다 표현식이 두 줄이다
        println("lambda function")
        true // 마지막 표현식 문장의 결과가 반환
    }
    val result2 = callByValue(lambda()) // 람다식 함수를 호출
    println(result2)


    val result3 = callByName(lambda) // 람다식 이름으로 호출
    println(result3)


}

fun highOrder(caluate: (Int, Int) -> Int, a: Int, b: Int): Int {
    return caluate(a, b)
}

fun callByValue(b: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}