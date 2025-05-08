package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 100)
    val number1 = Random.nextInt(1, 100)
    println("Сложите два числа $number + $number1")
    val numberEntered = readln().toInt()
    val userAnswer = number + number1

    if (numberEntered == userAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}