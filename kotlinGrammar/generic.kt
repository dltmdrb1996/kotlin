//수퍼클래스를 TestA로 제한한 제너릭T를 선언

fun main() {
    class UsingGeneric<T: TestA> (val x: T){
        fun doShouting(){
            x.shout()
        }
    }
    class UsingGeneric2<T: TestC> (val x: T){
        fun doShouting(){
            x.shout()
        }
    }

    UsingGeneric(TestA()).doShouting()
    UsingGeneric(TestB()).doShouting()
    UsingGeneric(TestC()).doShouting()

//    UsingGeneric2(TestA()).doShouting() 에러

    shouting(TestB())
    shouting(TestC())

}

open class TestA {
    open fun shout(){
        println("A가 소리칩니다.")
    }
}

open class TestB : TestA() {
    override fun shout(){
        println("B가 소리칩니다.")
    }
}

open class TestC : TestA() {
    override fun shout(){
        println("C가 소리칩니다.")
    }
}

fun <T: TestA> shouting(x: T){
    x.shout()
}