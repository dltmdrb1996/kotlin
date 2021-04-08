package strategy_apdater

fun main(){
    // 인터페이스를 활용한 모듈화
    // 선언과 기능을 분리
    val searchButton = SearchButton()

    searchButton.onClick()
    searchButton.setSearchStrategy(SearchModeMovie())
    searchButton.onClick()
    searchButton.setSearchStrategy(SearchModeMusic())
    searchButton.onClick()
    searchButton.setSearchStrategy(SearchModeImage())
    searchButton.onClick()
    /// 어댑터를 통해 기능 연결
    searchButton.setSearchStrategy(SearchFindAdapter(FindModeAnimation()))
    searchButton.onClick()
    searchButton.setSearchStrategy(SearchFindAdapter(FindModeDrama()))
    searchButton.onClick()

}