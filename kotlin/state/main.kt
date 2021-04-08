package state

fun main(){
    // 핵심은 인터페이스를 활용한 모듈화
    val modeSwitch = ModeSwitch()

    modeSwitch.onSwitch()
    modeSwitch.onSwitch()
    modeSwitch.onSwitch()
    modeSwitch.onSwitch()
}