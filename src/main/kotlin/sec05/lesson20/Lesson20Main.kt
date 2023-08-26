package sec05.lesson20

import `object`.Person

fun main() {

}

//fun printPerson(person: Person?) {
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }
//}
fun printPerson(person: Person?) {
    person?.let {   // lambda를 통해 일시적인 scope 생성
        // let : 확장 함수, 람다를 받아, 람다 결과를 반환한다.
        println(it.name)
        println(it.age)
    }
}