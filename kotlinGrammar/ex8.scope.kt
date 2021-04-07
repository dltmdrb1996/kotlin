fun main(){

    var a = Book("책",10000).apply {
        name = "[초특가]"+this.name
        price = 6000
        discount()
    }

    a.run {
        println("$name 은 $price 원입니다")
    }

    val resultit = a.let {
        it.name="만화책"
        it.price=10000
        it
    }
    println(resultit.name+"은 " + resultit.price+"원입니다" )
    println(a.name+"은 " + a.price+"원입니다" )

    a.run {
        println("$name 은 $price 원입니다")
    }


}

data class Book(var name : String , var price : Int  ){
    fun  discount(){
        price=price-2000
    }
}