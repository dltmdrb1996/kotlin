package meditor

class ModeSwitch {
    private var mode = Mode.LIST

    private var modeMediator : ModeMediator? = null

    fun setModeMediator(modeMediator: ModeMediator){
        this.modeMediator = modeMediator
    }

    fun toggleMode(){
        mode = if(mode==Mode.LIST) Mode.LIST else Mode.GALLERY

        modeMediator?.onModeChange(mode)
    }
}