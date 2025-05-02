package org.example.lesson_2

fun main () {

    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTimeMinute = 457
    val arrivalTimeHour = travelTimeMinute / 60 + departureTimeHour


    print(arrivalTimeHour)
    print(":")
    print(departureTimeMinute)
}