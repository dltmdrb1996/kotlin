fun main() {

    var dummy = Person()
    dummy.intro()
    var lsg = Person("이승규", 1996)
    lsg.intro()
    var kms = Person("김민수", 1990)
    kms.intro()
    dummy.intro()

}

class Person(var name: String, var birth: Int) {
    object count {
        var cnt = 0
        fun upCount() {
            cnt = cnt + 1
        }
    }

    init {
        count.upCount()
    }

    constructor() : this("더미", 2020) {

    }

    fun intro() {
        println("안녕하세요 저는 ${name}입니다 저는 ${birth}년에 태어났습니다")
        println("현재 Person 인스턴스 ${count.cnt}개 생성")
    }
}


