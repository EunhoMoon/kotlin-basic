package lesson03

import `object`.Person

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()
    // kotlin에서는 기본 자료형의 형변환을 .to~을 사용하여 명시적으로 선언해주어야 한다.

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L
    // nullable 변수에 대해서는 적절한 처리가 필요하다.(safe call, elvis)

    printAgeIfPerson(Person("", 100))
    printAgeIfPersonNullable(null)

    val person = Person("test", 100)
    println("이름: ${person.name} / 나이: ${person.age}")

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

    val str1 = "ABC"
    println(str1[0])    // java에서의 str1.charAt(0)

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {    // is == java: instance of
//        val person = obj as Person  // as = java: (Object) obj, 생략 가능
//        val person = obj
//        println(person.age)
        println(obj.age)
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person: Person? = obj as? Person    // as? : obj가 해당 타입이면 형변환, null이거나 해당 타입이 아니면 null을 반환
    println(person?.age)
}