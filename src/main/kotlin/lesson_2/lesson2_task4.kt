package org.example.lesson_2

const val ONE_HUNDRED = 100

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20
    val buffCrystallineOre = (crystallineOre * buff) / ONE_HUNDRED
    val buffironOre = (ironOre * buff) / ONE_HUNDRED

    println(buffCrystallineOre)
    println(buffironOre)
}