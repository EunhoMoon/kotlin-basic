package sec03.lesson10

fun main() {
    Derived(300)
}

open class Base (
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
        // Accessing non-final property number in constructor
        // 상위 클래스가 초기화 되기 전에 하위 클래스가 number에 접근하기 때문에 어느 값도 아닌 기본값 0이 출력된다.
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}