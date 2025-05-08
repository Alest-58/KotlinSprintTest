package org.example.lesson_4

fun main() {
    val day = 5
    val day5 = (day % 2) == 0
    val exercisesForTheHands = !day5
    val legExercises = day5
    val exercisesForTheBack = day5
    val exercisesForThePress = !day5

    println(
        """Упражнения для рук:    $exercisesForTheHands
Упражнения для ног:    $legExercises
Упражнения для спины:  $exercisesForTheBack
Упражнения для пресса: $exercisesForThePress """
    )
}