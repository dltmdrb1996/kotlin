import java.util.*

fun main(){
    EventPrinter().start()
}

interface EventListner{
    fun onEvent(count : Int)
}

class Counter2(var listner: EventListner){

    fun count(){
        for(i in 1..100) {
            if (i % 5 == 0) listner.onEvent(i)
        }
    }
}

class EventPrinter{


    fun start(){
        val counter2 = Counter2(object : EventListner{
            override fun onEvent(count: Int) {
                print("$count -")
            }
        })
        counter2.count()
    }
}