fun main(){
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a){
        println("${item}")
    }

    a.add("낑깡")

    for(item in a){
        println("${item}")
    }


    val b = mutableMapOf("레드벨벳" to "red flavor",
    "트와이스" to "fancy",
    "ITZY" to "ICY")

    for(entry in b){
        println("${entry.key} : ${entry.value}")

    }

    b.put("오마이걸","번지")
    println(b)

    b.remove("ITZY")
    println(b)

}



