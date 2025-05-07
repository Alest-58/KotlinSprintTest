package org.example.lesson_5

fun main() {
    println("Сложите 2+2")
    val number = readln().toInt()
    val userAnswer = 4
    println(number)

    if (number == userAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}