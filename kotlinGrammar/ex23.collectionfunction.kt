fun main() {

    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach { print("$it ") }
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map{"이름 : $it" })

    println(nameList.any{ it == "김지원"})  // or조건

    println(nameList.all { it.length == 3 }) // and 조건

    println(nameList.none{ it.startsWith("이")}) // not and

    println(nameList.first{ it.startsWith("김")}) // 조건 안맞으면 null exception

    println(nameList.last{ it.startsWith("김")})

    println(nameList.count{ it.contains("지")})
}


