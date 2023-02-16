package sec03.lesson14

fun main() {
    val dto1 = PersonDto("은호", 20)
    val dto2 = PersonDto("은호", 30)
    println(dto1 == dto2)
    println(dto1)
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

data class PersonDto(
    // data class : 자동으로 equals, toString, hashCode를 생성해준다.
    val name: String,
    val age: Int
) {
}

enum class Country (
    private val code: String
) {
    KOREA("KO"), AMERICA("US")
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그랜저", 3_000L)
