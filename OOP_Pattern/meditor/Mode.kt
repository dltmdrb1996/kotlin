package meditor
enum class Mode {
    LIST,
    GALLERY
}
interface ModeListener{
    fun onModeChange(mode : Mode)
}

class ListView : ModeListener{
    override fun onModeChange(mode: Mode) {
        println("리스트뷰 ${if(mode == Mode.LIST) "보여줌" else "감춤"}")
    }
}

class GalleryView : ModeListener{
    override fun onModeChange(mode: Mode) {
        println("갤러리뷰 ${if(mode == Mode.GALLERY) "보여줌" else "감춤"}")
    }
}

class DataDownloader : ModeListener{
    override fun onModeChange(mode: Mode) {
        println("${if(mode == Mode.LIST) "리스트" else "갤러리"} 데이터 다운로드")
    }
}