package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val TIME_OF_THE_YEAR = "зима"

fun main() {
    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidity = 20
    val currentTimeOfTheYear = "зима"
    val result = (IS_SUNNY == weatherToday) && (AIR_HUMIDITY == airHumidity)
            && (IS_AWNING_OPEN == awningAtTheMoment) && (currentTimeOfTheYear != TIME_OF_THE_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}


