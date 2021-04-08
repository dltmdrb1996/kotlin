package singleton

class SecondPage{
    var settings = Settings
    fun setAndPrintSettings(){
        println("${settings.getDarkMode()}  ${settings.getFontSize()}")
    }

}
