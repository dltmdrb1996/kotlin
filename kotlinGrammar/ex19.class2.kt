fun main(){

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduce()
    inner.introduceOuter()

    outer.text = "Changer Outer Class"
    inner.introduceOuter()
}

class Outer{
    var text = "outer"

    class Nested{
        fun introduce(){
            println("nested")
        }
    }
    inner class Inner{
        var test = "inner"
        fun introduce(){
            println(test)
        }
        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}