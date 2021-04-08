package proxy

fun main(){
    val thumbnails = ArrayList<Thumbnail>()

    thumbnails.add(ProxyThumbnail("자바 강좌","java.mp4"))
    thumbnails.add(ProxyThumbnail("코틀린 강좌","kotlin.mp4"))
    thumbnails.add(ProxyThumbnail("안드로이드 강좌","android.mp4"))
    thumbnails.add(ProxyThumbnail("깃 강좌","git.mp4"))

    //프록시의 기능으로만 기능 실행
    for(thumbnail in thumbnails){
        thumbnail.showTitle()
    }

    //RealThumbnail 생성
    for(thumbnail in thumbnails){
        thumbnail.showPreview()
    }

    thumbnails.get(2).showPreview()  // 한번 생성한 객체는 재생성 x

}