package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientAmount = 70000
    val interestRate = 16.7
    val timePeriod = 20
    val one = 1
    val oneHundred = 100

    val depositAmountAfter20Years =
        clientAmount.toDouble() * ((one + interestRate / oneHundred).pow(timePeriod.toDouble()))
    println("%.3f".format(depositAmountAfter20Years))
}