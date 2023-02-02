package com.example.kotlinbasics

fun main(){
    var martin = Person("Martin", "Rohde", 31)
    martin.hobby = "Warhammer 40k" // skifter properties
    martin.stateHobby()
    martin.age = 32
    println("Martin is ${martin.age}")
    var john = Person() // denne indeholder default values
    john.hobby = "kicking a baby"
    john.stateHobby()
    var johnPeterson = Person(lastName = "Peterson") // på denne måde kan man skifte én specifik værdi
    johnPeterson.hobby = "play videogames"
    johnPeterson.stateHobby()

    var samsung = MobilePhone("Android","Samsung","21 Ultra")
    var iphone = MobilePhone("IOS","Apple","Iphone 14")
    var onePlus = MobilePhone("Android","OnePlus","7 pro")

    myFunction(5) //a is the parameter
}

// constructor gør det muligt at tilføje værdiger til éns class
// man behøver ikke skrive constructor
class Person constructor(firstName: String = "John", lastName: String = "Doe"){
    // John Doe er default values i denne sammenhæng

    // Memeber Variables - Properties
    var age : Int? = null
    var hobby : String = "Watch netflix"
    var firstName : String? = null // denne bruges til at kunne udskrive navn i stateHobby funktionen

    init { // Initializer Block
        this.firstName = firstName
        println("Initialized a new person object with firstName = $firstName and lastname = $lastName")
    }

    // Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName,lastName){
        this.age = age
        println("Initialized a new person object with firstName = $firstName and lastname = $lastName and age = $age" )
    }


    // Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("Phone model: $model - Brand: $brand - OS: $osName")
    }
}

fun myFunction(a:Int){
    // a is a variable inside the function
    var b = a   // hvis 'var a' stod først, så ville b være 4, grundet at vi har skrevet det som variabel inden.
                // Når den står først får vi det direkte parameter der er sendt til funktionen.
    var a = 4

    println("a is $a")
    println("b is $b")
}