package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTimeMinute = 457
    val totalMinutes = (departureTimeHour * MINUTES_IN_HOUR + departureTimeMinute + travelTimeMinute)
    val arrivalTimeHour = totalMinutes / MINUTES_IN_HOUR
    val arrivalTimeMinute = totalMinutes % arrivalTimeHour

    print("%02d:%02d".format(arrivalTimeHour, arrivalTimeMinute))
}