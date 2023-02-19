package sec04.lesson15

fun main() {
    /** 배열 */
    val array = arrayOf(100, 200)

//    for (index in array.indices) {
//        println("${index} : ${array[index]}")
//    }

    val plusArray = array.plus(300)

    for ((idx, value ) in array.withIndex()) {
        println("$idx $value")
    }

    for (i in plusArray) {
        println(i)
    }

    /** List */
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()   // 비어있는 List는 명시적으로 자료형을 선언해주어야 한다.
    printNumbers(emptyList())   // 자료형이 추론 가능할 때는 생략 가능

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx : $value")
    }

    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    for (mutableNumber in mutableNumbers) {
        println(mutableNumber)
    }

    /** Map */
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println("$key : ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("$key : $value")
    }

}

private fun printNumbers(numbers: List<Int>) {

}