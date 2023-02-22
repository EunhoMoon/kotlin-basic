package sec05.lesson19

import sec04.lesson18.Fruit

fun main() {

}

typealias FruitFilter = (Fruit) -> Boolean
private fun filterFruits(
    fruits: List<Fruit>, filter: FruitFilter)
        : List<Fruit> {
    val results = mutableListOf<Fruit>()
    return fruits.filter(filter)
}
