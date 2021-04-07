fun main() {

    var sum: (Int, Int ) -> Int = { a, b -> a + b }

    fun a(str: String) {
        println("$str 함수 a")
    }

    fun b(function: (str: String) -> Unit) {
        function("b가 호출한")
    }

    fun hap(function : Int) {
        println("둘의 합은 $function ")
    }

     fun hoFun(x1: Int, argFun: (Int) -> Int){
           val result = argFun(10)
           println("x1 : $x1, someFun1 : $result")
    }

    hoFun(10) { x -> x * x }

    println(sum(5,6))
    println(hap(sum(4,5)))  //sum(4,5)가 하나의 int형으로 return 됨 즉 이것이바로 함수릅 변수처럼 사용의 예시


}
