package lesson02

import `object`.Person
import java.lang.IllegalArgumentException

fun main() {
    val str: String? = "ABC"
    val str2: String? = null
    // safecall 값이 null인 객체에 대해서는 null을 반환하고 아닐 경우에만 해당 값을 반환한다.
    println(str?.length)    // 3
    println(str2?.length)   // null

    // Elvis 연산자: 앞의 연산 결과가 null이면 뒤의 값을 사용
    println(str?.length ?: 0)   // 3
    println(str2?.length ?: 0)  // 0

    println(startsWith("ABC"))

    // kotlin에서 java객체를 사용할 때 Annotation을 통해 처리할 수 있다.(@Nullable, @NotNull)
    // Annotation을 사용하지 않을 경우 validation 체크를 해야 runtime exception이 발생하지 않는다.
    val person = Person("공부하는 개발자")
    startsWith2(person.name)
}

/**
 * - kotlin에서는 기본적으로 변수 안에 null이 들어갈 수 없다.
 * - null이 들어갈 수 있는 변수는 완전히 다른 타입으로 취급한다.
 */

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA1BySafeCallAndElvis(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.");
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2BySafeCallAndElvis(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    // null이 들어올 수 있는 변수에 대한 함수 호출을 바로 할 수 없다.
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3BySafeCallAndElvis(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
    // !! : 이 변수는 절대 null이 될 수 없다는 것을 명시적으로 선언(null 아님 단언)
    // null일 경우 NullPointException이 발생한다.
}

fun startsWith2(str: String): Boolean {
    return str.startsWith("A")
}