package state

interface ModeState{
    fun toggle(modeSwitch: ModeSwitch)
}

class ModeStateLight() : ModeState{
    override fun toggle(modeSwitch: ModeSwitch) {
        println("화면을 밝게합니다")

        modeSwitch.setState(ModeStateDark())
    }
}
class ModeStateDark() : ModeState{
    override fun toggle(modeSwitch: ModeSwitch) {
        println("화면을 어둡게합니다")

        modeSwitch.setState(ModeStateLight())
    }
}
