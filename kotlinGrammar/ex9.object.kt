fun main(){

    println(Counter.cnt)
    Counter.countup()
    Counter.countup()
    Counter.countup()

    println(Counter.cnt)


}
public object Counter{
    var cnt = 0
    fun countup(){
        cnt++
    }
    fun clear(){
        cnt=0
    }
}

