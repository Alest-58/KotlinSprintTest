package org.example.lesson_4

fun main() {
    val day = 5
    val isEven = (day % 2) == 0
    val exercisesForTheHands = !isEven
    val legExercises = isEven
    val exercisesForTheBack = isEven
    val exercisesForThePress = !isEven

    println(
        """Упражнения для рук:    ${!isEven}
Упражнения для ног:    ${isEven}
Упражнения для спины:  ${isEven}
Упражнения для пресса: ${!isEven} """
    )
}