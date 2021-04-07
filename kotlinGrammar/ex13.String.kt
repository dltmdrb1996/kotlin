fun main(){
    var test ="나는.이승규.입니다"

    println(test.length)

    println(test.substring(0..3))
    var test2 = test.split(".")
    println(test2)
    var test3 = test2.joinToString("-")
    println(test3)
    println(test2[2])


    val nullStirng : String? = null
    val emptyString = ""
    val blankString = " "
    val nomalString ="나는 정상"
    println(nullStirng.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(nomalString.isNullOrBlank())

    println(nullStirng.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(nomalString.isNullOrEmpty())


    var test4 ="kotlin.kt"
    var test5 ="java.java"

    println(test4.contains("tli"))
    println(test5.startsWith("java"))
    println(test4.endsWith("kt"))
}