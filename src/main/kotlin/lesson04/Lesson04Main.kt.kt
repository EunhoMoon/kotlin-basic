package lesson04

import `object`.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {  // 비교 연산자 사용시 자동으로 compareTo를 호출한다.(객체간 비교 가능)
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val m1 = JavaMoney(1_000)
    val m2 = m1
    val m3 = JavaMoney(1_000)

    println(m1 === m2)
    println(m1 == m3)
    println(m2 === m3)

    val kMoney1 = Money(1_000L)
    val kMoney2 = Money(2_000L)

    println(kMoney1 + kMoney2)

}