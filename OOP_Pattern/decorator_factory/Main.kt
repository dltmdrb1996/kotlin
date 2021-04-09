package decorator_factory

fun main() {

    // 기존에 있던 기능에 추가적인 기능을 덧붙히고 싶을떄 사용
    println(BasePizza().addTopping())
    println(CheeseDecorator(BasePizza()).addTopping())

    val combinationPizza = CheeseDecorator(
        MeetDecorator(
            VegetableDecorator(
                BasePizza()
            )
        )
    )
    println(combinationPizza.addTopping())

    // 팩토리를 통해 복잡한 과정없이 생성

    val cheesePizza = PizzaFactory().makePizza(true,false,false)
    cheesePizza.addTopping()

    val cheeseVegetablePizza = PizzaFactory().makePizza(true,false,true)
    cheeseVegetablePizza.addTopping()
}