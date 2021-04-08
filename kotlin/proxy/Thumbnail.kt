package proxy

interface Thumbnail{
    fun showTitle()
    fun showPreview()
}

class RealThumbnail(private val title : String, private val movieURL : String) : Thumbnail{
    init {
        println("${movieURL}로부터 ${title}의 영상 데이터 다운") //무거운 작업에 해당하는 내용 따라서 가볍게 쓸수있는 프록시기능이 필요
    }

    override fun showTitle() {
        println("제목 : $title")
    }

    override fun showPreview() {
        println("${title}의 프리뷰 재생")
    }

}

class ProxyThumbnail(private val title : String , private val movieURL: String) : Thumbnail{
    var realThumbnail : RealThumbnail? = null
    override fun showTitle() {
        println("제목 : $title")
    }

    override fun showPreview() {
        if(realThumbnail == null){
            realThumbnail = RealThumbnail(title , movieURL)
        }
        realThumbnail!!.showPreview()
    }

}
