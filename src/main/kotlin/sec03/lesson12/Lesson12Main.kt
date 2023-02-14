package sec03.lesson12

import `object`.Movable

fun main() {
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("움직이다.")
        }

        override fun fly() {
            println("날다")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행 객체입니다.")
        }
    }

}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}