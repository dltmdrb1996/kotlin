package strategy_apdater

interface SearchStrategy{
    fun search()
}

class SearchModeAll : SearchStrategy{
    override fun search() {
        println("모든 영역 검색")
    }
}

class SearchModeImage : SearchStrategy{
    override fun search() {
        println("이미지 영역 검색")
    }
}

class SearchModeMusic : SearchStrategy{
    override fun search() {
        println("음악 영역 검색")
    }
}

class SearchModeMovie : SearchStrategy{
    override fun search() {
        println("영화 영역 검색")
    }
}


