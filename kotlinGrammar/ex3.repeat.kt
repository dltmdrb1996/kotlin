fun main(){
    var arrInt : Array<Int?>
    var arrString : Array<String?>
    arrInt = arrayOf(1,2,3,4,5,6,7,8,9)
    arrString = arrayOf("일","이","삼","사","오")

    for(i in arrInt.indices){

    }

    for((index , value) in arrInt.withIndex()){
        println("$index = $value")
    }
    var sum = 0
    for(i in 1..10){
        sum += i
        if(i==10){
            print(sum)
        }
    }

}

