package singleton

class FirstPage {
        var settings = Settings

        fun setAndPrintSettings(){
            settings.setDarkMode(true)
            settings.setFontSize(15)

            println("${settings.getDarkMode()}  ${settings.getFontSize()}")
        }


}