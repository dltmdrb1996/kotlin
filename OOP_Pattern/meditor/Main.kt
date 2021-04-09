package meditor

fun main(){
    val modeSwitch = ModeSwitch()
    val modeSwitch2 = ModeSwitch()
    val modeMediator = ModeMediator()
    val modeMediator2 = ModeMediator()

    // 다양한 기능들을 직접 접근하지않고 중재자를 두어
    // 관계의 복잡도를 완화시킨다.
    modeSwitch.setModeMediator(modeMediator)
    modeSwitch2.setModeMediator(modeMediator)

    modeMediator.addListener(ListView())
    modeMediator.addListener(GalleryView())
    modeMediator.addListener(DataDownloader())

    modeSwitch.toggleMode()
    modeSwitch2.toggleMode()
    println()
    modeMediator2.addListener(ListView())

    modeSwitch2.setModeMediator(modeMediator2)
    modeSwitch2.toggleMode()
}