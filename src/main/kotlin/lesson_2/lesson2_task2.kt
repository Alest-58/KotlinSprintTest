package org.example.lesson_2

fun main () {
    val employees = 50
    val interns = 30
    val salariesOfEmployees = 30000
    val internsSalaries = 20000
    val expensesOfPermanentEmployees = employees * salariesOfEmployees
    val totalExpenses = expensesOfPermanentEmployees + interns * internsSalaries
    val averageCostPerEmployee = totalExpenses / 80
    println(expensesOfPermanentEmployees)
    println(totalExpenses)
    println(averageCostPerEmployee)
}