package sec05.lesson19

import sec04.lesson18.Fruit as FruitAlias    // as import

fun main() {
    val person = Person("Eunho", 31)
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()
    println("이름 : ${name}, 나이 : ${age}")    // 구조분해 할당 -> data class, component 함수 필요
}

typealias FruitFilter = (FruitAlias) -> Boolean  // type alias
private fun filterFruits(
    fruits: List<FruitAlias>, filter: FruitFilter)
        : List<FruitAlias> {
    val results = mutableListOf<FruitAlias>()
    return fruits.filter(filter)
}

data class Person(
    val name: String,
    val age: Int
)
