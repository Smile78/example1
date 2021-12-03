package com.example.sixmatcarviewpoly

sealed class Car(open val brand: String) {

    data class SportCar(
        override val brand: String,
        val speed: Int,
        val driftLevel: Int,
        val color: String
    ): Car(brand)

    data class CityCar(
        override val brand: String,
        val comfortLevel: Int,
        val price: Int

    ): Car(brand)


}
