package composite

fun main(){
    // 개념적으로 어떤 객체가 어떤 객체 포함되는 모습일떄
    // 좀더 쉽게 작은 객체들을 큰객체를 통해서 조작할수있게해준다.
    val movieFolder = Folder("영화폴더")
    val musicFolder = Folder("음악폴더")

    val actionMovieFolder = Folder("액션영화")
    val comedyMovieFolder = Folder("코미디영화")

    movieFolder.add(actionMovieFolder)
    movieFolder.add(comedyMovieFolder)

    musicFolder.add(File("아무노래",200))

    actionMovieFolder.add(File("미션임파서블",100))
    actionMovieFolder.add(File("미션임파서블2",100))
    actionMovieFolder.add(File("미션임파서블3",100))

    comedyMovieFolder.add(File("극한직업",100))

    movieFolder.getSize()

    musicFolder.getSize()
}