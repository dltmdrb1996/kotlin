import java.lang.NullPointerException

fun main(){
    var a : String? = null

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())
    try {
        println(a!!.toUpperCase())
    }catch (a : NullPointerException){
        println("a.message")
    }

    var q = Product("콜라",1000)
    var w = Product("콜라",1000)
    var e = Product("사이다다",100)
    var r = q

    println(q==w)
    println(q===w)
    println(q==r)
    println(q===r)
    println(q.equals(w))

}

class Product(val name : String, val price : Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}