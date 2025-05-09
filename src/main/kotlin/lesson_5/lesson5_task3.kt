package org.example.lesson_5

const val NUMBER_WIN_1 = 10
const val NUMBER_WIN_2 = 30

fun main() {
    println("Вам нужно угадать два числа! от 0 до 42")
    println("Введите 1 число ")
    val userNumber1 = readln().toInt()
    println("Введите 2 число ")
    val userNumber2 = readln().toInt()

    if (NUMBER_WIN_1 == userNumber1 && NUMBER_WIN_2 == userNumber2 ||
        NUMBER_WIN_2 == userNumber1 && NUMBER_WIN_1 == userNumber2
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
//    } else if (NUMBER_WIN_2 == userNumber1 && NUMBER_WIN_1 == userNumber2) {
//        println("Поздравляем! Вы выиграли главный приз!")
    } else if (NUMBER_WIN_1 == userNumber1 || NUMBER_WIN_2 == userNumber2 ||
        NUMBER_WIN_2 == userNumber1 || NUMBER_WIN_1 == userNumber2
    ) {
        println("Вы выиграли утешительный приз!")
//    } else if (NUMBER_WIN_2 == userNumber1 || NUMBER_WIN_1 == userNumber2) {
//        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Числа для выигрыша 10 и 30!!!")
}


