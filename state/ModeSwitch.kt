package state

class ModeSwitch {
    private var modeState : ModeState = ModeStateLight()

    fun setState(modeState: ModeState){
        this.modeState = modeState
    }

    fun onSwitch(){
        modeState.toggle(this)
    }
}