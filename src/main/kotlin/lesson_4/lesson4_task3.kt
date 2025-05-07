package org.example.lesson_4

fun main() {
    val availabilityOfSunnyWeather = true
    val outdoorAwning = true
    val airHumidityIs = 20
    val theCurrentTimeOfTheYear = "не зима"
    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidity = 20
    val currentTimeOfTheYear = "зима"
    val result = (availabilityOfSunnyWeather == weatherToday) && (airHumidityIs == airHumidity)
    val result1 = airHumidityIs == airHumidity
    val result2 = theCurrentTimeOfTheYear !== currentTimeOfTheYear
    val result3 = result == result1 == result2

    println("Благоприятные ли условия сейчас для роста бобовых? $result3")
}


