package singleton
fun main(){

    val firstPage = FirstPage()
    val secondPage = SecondPage()
    //오브젝트를 통해 싱글톤 구현
    secondPage.setAndPrintSettings()
    firstPage.setAndPrintSettings()
    secondPage.setAndPrintSettings()
}









