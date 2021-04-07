fun main(){
    read(2)
    read("ㅇㅇ")

    deliver("승규")
    deliver("선물",destination = "친구네")

    sum(3,4,5,6,76,7)

    println(6.multiply(3))

}

fun read(x : Int){
    println("숫자 x입니다")
}

fun read(x : String){
    println(x)
}

fun deliver(name : String , count : Int =1 , destination : String ="집"){
    println("이름 : $name  숫자 : $count 목적지 : $destination")
}

fun sum(vararg numbers : Int){
    var sum = 0

    for(n in numbers){
        sum+=n
    }
    println(sum)
}

infix fun Int.multiply(x:Int): Int = this * x