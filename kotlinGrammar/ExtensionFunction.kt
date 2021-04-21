fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))

    val a = 3
    val b = 6
    println(a.getLongInt(b))

    // Int를 확장해서 multiply() 함수가 하나 더 추가되었음
    infix fun Int.multiply(x: Int): Int { // infix로 선언되므로 중위 함수
        return this * x

    }

    // 일반 표현법
    //val multi = 3.multiply(10)
    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")


}


// String을 확장해 getLongString 추가
fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target

fun Int.getLongInt(target: Int) : Int =
    if(this >= target) this else target

