package strategy_apdater

class SearchButton() {

    private var searchStrategy : SearchStrategy = SearchModeAll()

    fun setSearchStrategy(searchStrategy: SearchStrategy){
        this.searchStrategy = searchStrategy
    }


    fun onClick(){
        searchStrategy.search()
//        println(search.getNumber())
    }


}