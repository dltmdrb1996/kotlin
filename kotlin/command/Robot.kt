package command

class  Robot {

    enum class Direction(val msg : String) {
        RIGHT("오른쪽"),
        LEFT("왼쪽");
    }

    fun moveForward(space : Int){
        println("$space 칸 앞으로")
    }

    fun turn(direction: Direction){
        println( "${direction.msg} 으로 이동")
    }

    fun pickup(){
        println("물건을 집어듭니다")
    }

}

