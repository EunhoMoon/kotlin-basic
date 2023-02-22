package sec04.lesson19

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 200, 1_000),
        Fruit(2, "사과", 300, 1_200),
        Fruit(3, "사과", 400, 1_200),
        Fruit(4, "사과", 500, 1_500),
        Fruit(6, "바나나", 1_000, 3_000),
        Fruit(7, "바나나", 1_100, 3_200),
        Fruit(8, "바나나", 1_500, 2_500),
        Fruit(9, "수박", 3_000, 10_000)
    )

    val apples = fruits.filter {fruit -> fruit.name == "사과"}
    val isAllApple = fruits.all {fruit -> fruit.name == "사과"}
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean)
        : List<Fruit> {
    val results = mutableListOf<Fruit>()
    return fruits.filter(filter)
}

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)