package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val availabilityOfTablesForToday: Boolean = reservedTablesToday != TOTAL_TABLES
    val availabilityOfTablesForTomorrow: Boolean = reservedTablesTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня:$availabilityOfTablesForToday\nДоступность столиков на завтра:$availabilityOfTablesForTomorrow")
}