package decorator_factory

class PizzaFactory(){
    fun makePizza(cheese : Boolean , meet : Boolean , vegetable : Boolean) : Pizza{
        var pizza: Pizza = BasePizza()

        if (cheese) pizza = CheeseDecorator(pizza)
        if (meet) pizza = MeetDecorator(pizza)
        if (vegetable) pizza = VegetableDecorator(pizza)

        return pizza
    }

}