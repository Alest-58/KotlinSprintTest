package org.example.lesson_5

fun main() {
    println("Вам нужно угадать два числа! от 0 до 42")
    println("Введите 1 число ")
    val userNumber1 = readln().toInt()
    println("Введите 2 число ")
    val userNumber2 = readln().toInt()
    val numberWin1 = 10 == userNumber1
    val numberWin2 = 30 == userNumber2

    if (numberWin1 && numberWin2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (numberWin1 || numberWin2) {
        println("Вы выиграли утешительный приз!")
    } else if (!numberWin2 || numberWin1) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Числа для выигрыша 10 и 30!!!")
}


