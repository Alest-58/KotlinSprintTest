package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {
    val isWeatherToday = true
    val isAwningAtTheMoment = true
    val airHumidity = 20
    val currentTimeOfTheYear = "зима"
    val result = (IS_SUNNY == isWeatherToday) && (AIR_HUMIDITY == airHumidity) &&
            (IS_AWNING_OPEN == isAwningAtTheMoment) && (currentTimeOfTheYear != UNFAVORABLE_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}


