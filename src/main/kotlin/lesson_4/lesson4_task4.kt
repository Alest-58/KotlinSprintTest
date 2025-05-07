package org.example.lesson_4

fun main() {
    val days = 1..5
    val day5 = 5
    val exercisesForTheHands = day5 in days
    val legExercises = day5 !in days
    val exercisesForTheBack = day5 !in days
    val exercisesForThePress = day5 in days

    println(
        """Упражнения для рук:    $exercisesForTheHands
Упражнения для ног:    $legExercises
Упражнения для спины:  $exercisesForTheBack
Упражнения для пресса: $exercisesForThePress """
    )
}