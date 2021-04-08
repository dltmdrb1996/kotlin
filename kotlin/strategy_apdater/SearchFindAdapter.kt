package strategy_apdater

class SearchFindAdapter(val findStrategy: FindStrategy) : SearchStrategy {
    override fun search() {
        findStrategy.find(true)
    }

}