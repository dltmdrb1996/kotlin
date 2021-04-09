package meditor

class ModeMediator {
    private val listeners = ArrayList<ModeListener>()

    fun addListener(listener : ModeListener){
        this.listeners.add(listener)
    }

    fun onModeChange(mode : Mode){
        for(listener in listeners){
            listener.onModeChange(mode)
        }
    }
}
