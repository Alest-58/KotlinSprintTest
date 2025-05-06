package org.example.lesson_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = 1

    println("$whereFrom - $where ; $strokeNumber")
    whereFrom = "D2"
    where = "D"
    strokeNumber = 2
    println("$whereFrom - $where${2 + 1} ; $strokeNumber")
}
