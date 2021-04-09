package decorator_factory

interface Pizza{
    fun addTopping()
}

class BasePizza : Pizza{
    override fun addTopping() {
        println("피자")
    }
}


abstract class ToppingDecorator(private val decorator : Pizza) : Pizza{
    override fun addTopping() {
        decorator.addTopping()
    }
}

class CheeseDecorator(decorator : Pizza) : ToppingDecorator(decorator) {

    override fun addTopping() {
        super.addTopping()
        println("치즈토핑추가")
    }
}
class MeetDecorator(decorator : Pizza) : ToppingDecorator(decorator) {

    override fun addTopping() {
        super.addTopping()
        println("고기토핑추가")
    }
}
class VegetableDecorator(decorator : Pizza) : ToppingDecorator(decorator) {

    override fun addTopping() {
        super.addTopping()
        println("야채토핑추가")
    }
}


