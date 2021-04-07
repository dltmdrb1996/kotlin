fun main(){

    val list = listOf<man>(man("이승규",30,"남자"),man("임사랑",32,"남자"),man("김태양",34,"남자"),man("이승규",31,"남자"))


    list.forEach { println(" ${it.age} ${it.gender} ${it.name}") }

    val maplist = list.associateBy { it.name }

    for(entry in maplist){
        println(" ${entry.value} = ${entry.key} ")
    }
    println(list.groupBy { it.name })
    val (over32 , under32) = list.partition { it.age >32 }
    println(over32)
    println(under32)
}

data class man(var name : String ,var age : Int ,var gender : String ){
    fun intro(){
        println("이름 : $name ")
    }
}

