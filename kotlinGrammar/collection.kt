fun main() {

    val list5 : List<Int> =  listOf(1,2,3,4,5,4,3,1)
    println(list5)
    println("list5 사이즈 : ${list5.size}")

    for(i in 0 until list5.size) {
        println("list5[${i}]=${list5[i]}")
    }


    println()
    println()
    var list0 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map { it * 2 }.sum()
    var list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).sum()

    println(list0)
    println(list2)


    println()
    println()
    val list4 : List<Int> = List(10, {i->i+1})
    println(list4)


    //빈 리스트로 초기화
    //val list = mutableListOf<String>()

    println()
    println()
    val list: MutableList<String> = mutableListOf("apple", "orange", "peach")
    list.add("grape") //참조가 변경되는 것은 아니다.
    list.addAll(listOf("banana","pineapple"))
    println(list)
    println("list 사이즈 : ${list.size}")

    // val 리스트를 다시 할당하려고 함으로 컴파일 오류가 발생한다.
    // var를 사용하려 리스트를 정의하면 오류는 사라진다.
    //var list = mutableListOf<String>()
    //list = mutableListOf("banana", "pineapple")


    println()
    println()
    val setData: Set<Int> = setOf<Int>(1,2,1,1,2,3,4,5)
    println(setData)
    println("setData 사이즈 : ${setData.size}")



    println()
    println()
    val mutSet: MutableSet<String> = mutableSetOf("apple", "orange", "peach")
    mutSet.add("grape") //참조가 변경되는 것은 아니다.
    mutSet.addAll(listOf("banana","pineapple"))

    println(mutSet)
    println("mutSet 사이즈 : ${mutSet.size}")

    mutSet.remove("apple")
    println(mutSet)



    println()
    println()
    val hashSet : HashSet<String> = hashSetOf("apple", "orange", "peach")
    hashSet.add("grape") //참조가 변경되는 것은 아니다.
    hashSet.addAll(listOf("banana","pineapple"))

    println(hashSet)
    println("list 사이즈 : ${hashSet.size}")

    hashSet.remove("apple")
    println(hashSet)


    println()
    println()
    val linkedHashSet : LinkedHashSet<String> = linkedSetOf("apple", "orange", "peach")
    linkedHashSet.add("grape") //참조가 변경되는 것은 아니다.
    linkedHashSet.addAll(listOf("banana","pineapple"))

    println(linkedHashSet)
    println("list 사이즈 : ${linkedHashSet.size}")

    linkedHashSet.remove("apple")
    println(linkedHashSet)


    println()
    println()
    val map1: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3, Pair("d", 4), Pair("e",5))
    println(map1.get("a"))
    println(map1.get("d"))
    println("map1 사이즈 : ${map1.size}")


    println()
    println()
    val mutableMap: MutableMap<String, Int> = mutableMapOf("apple" to 1, "orange" to 2, "peach" to 3)
    mutableMap.put("grape", 4) //참조가 변경되는 것은 아니다.
    mutableMap.putAll(mutableMapOf("banana" to 5,"pineapple" to 6))
    println(mutableMap)
    println("list 사이즈 : ${mutableMap.size}")

    mutableMap.remove("apple")
    println(mutableMap)

    mutableMap["peach"] = 22
    println(mutableMap)
}

