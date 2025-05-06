package org.example.lesson_4


fun main() {
    val weightMin = 35
    val weightMax = 100
    val volume = 100
    var cargoKg = 20
    var cargoLiter = 80

    println(
        """Груз с весом $cargoKg кг и объемом $cargoLiter л соответствует категории 
        |'Average':${cargoKg > weightMin && cargoKg <= weightMax && cargoLiter < volume}""".trimMargin()
    )
    cargoKg = 50
    cargoLiter = 100
    println(
        """Груз с весом $cargoKg кг и объемом $cargoLiter л соответствует категории 
        |'Average':${cargoKg > weightMin && cargoKg <= weightMax && cargoLiter < volume}""".trimMargin()
    )
}