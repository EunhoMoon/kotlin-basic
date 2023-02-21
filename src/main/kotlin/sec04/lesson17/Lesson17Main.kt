package sec04.lesson17

fun main() {
    val str = "ABC"
    println(str.lastChar())
    println(1 add2 4)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

