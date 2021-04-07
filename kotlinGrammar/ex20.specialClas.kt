fun main(){

    val list = listOf(Data("보영",123),Data("승규",234),Data("동규",454))

    for((a,b) in list){
        println("$a  $b")
    }

    var state = State.SING
    println(state)

    state = State.EAT
    println(state)
    println(state.isSleep())

    state = State.SLEEP
    println(state.message)
    println(state.isSleep())
}

data class Data(val name : String , val id : Int){

}

enum class State(val message : String){
    SING("노래"),
    EAT("밥"),
    SLEEP("잠");

    fun isSleep()= this == State.SLEEP
}