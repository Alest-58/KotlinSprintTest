package org.example.lesson_5

fun main() {
    val numberWin1 = (0..42).random()
    val numberWin2 = (0..42).random()
    println("Вам нужно угадать два числа! от 0 до 42")
    println("Введите 1 число ")
    val userNumber1 = readln().toInt()
    println("Введите 2 число ")
    val userNumber2 = readln().toInt()

    if (numberWin1 == userNumber1 && numberWin2 == userNumber2 ||
        numberWin2 == userNumber1 && numberWin1 == userNumber2
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (numberWin1 == userNumber1 || numberWin2 == userNumber2 ||
        numberWin2 == userNumber1 || numberWin1 == userNumber2
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Числа для выигрыша $numberWin1 $numberWin2")
}


