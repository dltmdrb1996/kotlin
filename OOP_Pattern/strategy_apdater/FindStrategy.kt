package strategy_apdater

interface FindStrategy{
    fun find(boolean: Boolean)
}

class FindModeDrama : FindStrategy{
    override fun find(boolean: Boolean) {
        println("드라마를 검색합니다")
    }
}

class FindModeAnimation : FindStrategy{
    override fun find(boolean: Boolean) {
        println("만화를 검색합니다")
    }
}