package org.example.lesson_2

import kotlin.math.pow

fun main () {
    val clientAmount = 70000
    val interestRate = 16.7
    val timePeriod = 20
    val depositAmountAfter20Years = clientAmount. toDouble() * ((1 + interestRate / 100).pow(timePeriod.toDouble()))

    println(String.format("%.3f", depositAmountAfter20Years))

}