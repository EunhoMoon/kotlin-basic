package sec03.lesson10

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어간다.")
    }

}