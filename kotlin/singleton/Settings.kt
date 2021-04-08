package singleton

object Settings {
    private var darkMode = false
    private var fontSize = 13

    fun getDarkMode() = darkMode
    fun getFontSize() = fontSize

    fun setDarkMode(darkMode : Boolean) {this.darkMode = darkMode}
    fun setFontSize(fontSize : Int) {this.fontSize = fontSize}

}