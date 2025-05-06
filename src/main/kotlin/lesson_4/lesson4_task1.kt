package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val availabilityOfTablesForToday = reservedTablesToday < TOTAL_TABLES
    val availabilityOfTablesForTomorrow: Boolean = reservedTablesTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня:$availabilityOfTablesForToday")
    println("Доступность столиков на завтра:$availabilityOfTablesForTomorrow")
}