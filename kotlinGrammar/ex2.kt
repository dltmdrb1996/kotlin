fun main(){

    var a = 7
    var b = "안녕"

    if(a>10) println("a는 10보다 크다") else println("a는 10보다 작다")


    fun dowhen(a : Any) : Any{
        var result  = when(a){
            is Int -> println("정수형입니다")
            is String -> println("문자열입니다")
            is Unit -> println("반환형 없음")
            else -> ("몰라")
        }
        return result
    }
    dowhen(dowhen(dowhen(b)))

    label@
    for(i in 1..10){
        for(j in 1..10){
            if (i==1 && j==2) break@label
            println("i : $i, j : $j")
        }
    }


}