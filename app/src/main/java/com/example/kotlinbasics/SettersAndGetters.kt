package com.example.kotlinbasics

fun main(){
    var myCar = Car()
    myCar.myBrand
    println("Brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Max speed is ${myCar.maxSpeed}")
    println("Model is: ${myCar.myModel}")
    //myCar.myModel = "M3"  // Dette giver en error grundet at den er sat som private.
                            // Den kan dog ændres ved at lave ændringen i init
}
    // field bruges til at referere til værdier inden i getter og setter
    // value er den værdi der er givet til den enkelte variabel når man setter den


class Car(){
    lateinit var owner : String //lateinit betyder at den bliver initialized senere

    val myBrand : String = "BMW"
    get(){
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250

    //get() = field
    set(value) {
        field = if (value > 0) value else throw java.lang.IllegalArgumentException("maxSpped cannot be less than 0")
        // Ovenstående er for at checke om der er minus i det indskrevne
    }

    var myModel: String = "M5"
        private set // kun tilgængelig i denne class

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}