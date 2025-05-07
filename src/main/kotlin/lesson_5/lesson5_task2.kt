package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {
    println("Введите год рождения")
    val number = readln().toInt()
    println(number)
    val userAge = CURRENT_YEAR - number
    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}