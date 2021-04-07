fun main() {

    var boksil = Dog("복실이",5)
    var navi = cat("나비",5)
    boksil.intro()

    boksil.crying()
    navi.crying()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun intro() {
        println("이름 $name 나이 $age 종류 $type")
    }
    open fun crying(){
        println("몰라")
    }
}


class Dog(name: String, age: Int) : Animal(name, age, "개") {

    override fun crying() {
        println("멍멍")

    }
    fun bark(){
        println("멍멍")
    }
}

class cat(name : String , age : Int) : Animal (name, age , "고양이"){

    override fun crying() {
        println("냐옹")

    }
    fun meow(){
        println("냐야야양양")
   }
}