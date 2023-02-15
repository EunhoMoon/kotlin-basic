package sec03.lesson13

fun main() {

}

class JavaHouse(    // Java에서 권장되는 중첩 클래스의 형태
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom (
        private val area: Double
    )
}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom (
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}