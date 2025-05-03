package org.example.lesson_2

const val minutesInHour = 60
const val secondsInHour = 3600

fun main() {

    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTimeMinute = 457

    val totalSeconds = ((departureTimeHour * minutesInHour + departureTimeMinute + travelTimeMinute) * minutesInHour)
    val arrivalTimeHour = totalSeconds / secondsInHour
    val arrivalTimeMinute = (totalSeconds % secondsInHour) / minutesInHour
    print("%02d:%02d".format(arrivalTimeHour, arrivalTimeMinute))

}