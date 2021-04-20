fun main(){

    // 인자와 반환값이 있는 함수
    fun sum(a: Int, b: Int) = a + b
    fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
        return c(a, b)
    }
    val res1 = funcParam(3, 6, ::sum)
    println(res1)

    println()
    println()
    // 인자가 없는 함수
    fun text(a: String, b: String) = "Hi! $a $b"
    fun hello(body: (String, String) -> String): Unit {
        println(body("Hello", "World"))
    }
    hello(::text) // 반환값이 없음

    println()
    println()
    // 매개변수 없는 람다식 함수
    fun noParam(out: () -> String) = println(out())
    noParam({ "Hello World!" })
    noParam { "Hello World!!!!" } // 위와 동일 결과, 소괄호 생략 가능

    println()
    println()
    // 매개변수가 하나 있는 람다식 함수
    fun oneParam(out: (String) -> String) {
        println(out("OneParam"))
    }
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World!! $a" } // 위와 동일 결과, 소괄호 생략 가능
    oneParam { "Hello World!!! $it" } // 위와 동일 결과, it으로 대체 가능

    println()
    println()
    // 매개변수가 두 개 있는 람다식 함수
    fun moreParam(out: (String, String) -> String) {
        println(out("OneParam", "TwoParam"))
    }
    moreParam { a, b -> "Hello World! $a $b"} // 매개변수명 생략 불가
    moreParam { _, b -> "Hello World! $b"} // 첫 번째 문자열은 사용하지 않고 생략

    println()
    println()
    // withArgs함수는 일반 매개변수 2개를 포함, 람다식 함수를 마지막 매개변수로 가짐
    fun withArgs(a: String, b: String, out: (String, String) -> String) {
        println(out(a, b))
    }
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" }) // 인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2") { a, b -> "Hello World!!! $a $b" } // withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능

    println()
    println()
    // 두개의 람다식을 가진 함수의 사용
    fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
        println(first("OneParam", "TwoParam"))
        println(second("OneParam"))
    }
    twoLambda({ a, b -> "First $a $b" }, {"Second $it"})
    twoLambda({ a, b -> "First2 $a $b" }) {"Second2 $it"} // 위와 동일

    println()
    println()
    // 람다식에서 return 사용
    retFunc()

    println()
    println()
    // 라벨과 함꼐 return 사용
    retFunc2()


}



inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc") // ①
    inlineLambda(13, 3) { a, b -> // ②
        val result = a + b
        if(result > 10) return // ③ 10보다 크면 이 함수를 빠져 나감
        println("result: $result") // ④ 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc") // ⑤
}

fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> // ① 람다식 블록의 시작 부분에 라벨을 지정함
        val result = a + b
        if(result > 10) return@lit // ② 라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    } // ③
    println("end of retFunc") // ④ 이 부분이 실행됨
}