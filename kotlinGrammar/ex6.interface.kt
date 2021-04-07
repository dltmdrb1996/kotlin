fun main(){

    var bokdol = Dog2()

    bokdol.eat()
    bokdol.run()
}

interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}

class Dog2 : Runner , Eater{
    override fun eat() {
        super.eat()
    }

    override fun run() {
        println("뜁니다")
    }
}