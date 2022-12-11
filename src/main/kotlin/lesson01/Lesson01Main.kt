package lesson01

fun main() {

//    var num1 = 10L  // variable, 가변 변수
//    val num2 = 10L  // value, 불변 변수

    // 변수 타입을 명시적으로 선언 가능
//    var num1: Long = 10L
//    val num2: Long = 10L

//    var num1: Long
//    num1 = 5
//    val num2: Long
//    num2 = 5L   // val 변수는 초기화 되지 않았을 경우 최초 한 번 값을 넣어줄 수 있다.
//    println(num1)

    // val Collection은 element를 추가할 수 있다.
    // kotlin은 number, boolean, String 변수들을 상황에 맞게 자동으로 primitive type으로 변환해준다.

    var num1 = 10L
    var num3: Long? = 1_000L
    num3 = null
    // kotlin에서 변수 안에 null이 들어갈 수 있는지 여부를 ?를 통해 선언해주어야 한다.

//    var person = object.Person()
    // kotlin에서는 객체를 인스턴스화 할 때 new를 붙이지 않는다.

}