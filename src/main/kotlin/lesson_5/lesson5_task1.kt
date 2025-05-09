package org.example.lesson_5

fun main() {
    val number = (1..100).random()
    val number1 = (1..100).random()
    println("Сложите  два числа $number + $number1")
    val numberEntered = readln().toInt()
    val correctAnswer = number + number1

    if (numberEntered == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}