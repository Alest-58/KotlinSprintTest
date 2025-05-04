package org.example.lesson_2

const val oneHundred = 100
fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20

    val buffCrystallineOre = (crystallineOre * buff) / oneHundred
    val buffironOre = (ironOre * buff) / oneHundred
    println(buffCrystallineOre)
    println(buffironOre)
}