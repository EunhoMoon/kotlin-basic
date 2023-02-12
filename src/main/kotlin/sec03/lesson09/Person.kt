package sec03.lesson09

class Person(name: String, var age: Int) {  // 주 생성자, 반드시 존재해야 한다.

    val name = name
        get() = field.uppercase()   // 무한 getter 호출을 막기위해 name을 field로 호출

    init {
        // init : class가 초기화될 때 한 번 실행되는 로직(생성자 호출 시점)
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    constructor(name: String): this(name, 1)
    // 부 생성자, 최종적으로 주 생성자를 호출해야 한다. 코틀린은 부 생성자보다 default 파라미터를 권장한다.

}