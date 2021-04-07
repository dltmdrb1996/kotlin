fun main(){
    val foodcat = FoodCount()

    println(    foodcat.searchPrice("파스타")
    )

}


class FoodCount{
    fun searchPrice(foodName : String) : Int{
        val price = when(foodName){
            FOOD_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 20000
            else -> 10000
        }
        return price
    }
    companion object{
        const val FOOD_PASTA ="파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자자"
    }
}
