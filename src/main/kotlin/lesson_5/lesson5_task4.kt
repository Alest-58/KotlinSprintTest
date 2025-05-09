package org.example.lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Введите имя пользователя")
    val userName1 = readln()
    if (USER_NAME == userName1) {
        println("Введите пароль!")
        val userPassword1 = readln()
        if (USER_PASSWORD == userPassword1)
            println("Приветствую тебя Zaphod")
        else println("Пройдите регистрацию!")
    } else println("Пройдите регистрацию!")
}


