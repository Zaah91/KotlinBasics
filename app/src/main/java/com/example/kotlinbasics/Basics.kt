package com.example.kotlinbasics

fun main() {
    var myName = "Martin"
    myName = "Bob" //String

    var myAge = 31 // int
    // Integer types: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating point number types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F // skal bruge F efter tallet for at fortælle det er en Float.
    val myDouble: Double = 3.141592653598793

    // ved brug af : fortæller vi den efterfølgende hvilken type det er.
    // på denne måde sikrer vi os bedre til dens brug.

    // Booleans is logical values. True or false.
    var isSunny: Boolean = true // man behøver ikke skrive : Boolean, det kan den selv finde ud af ved brug af true eller false
    isSunny = false

    // Characters kan kun indeholde et tegn og kan ses med ''
    val letterChar = 'A'
    val digitChar = '1'
    val dollarchar = '$'

    // Strings
    val myStr = "Hello world!"
    var firstCharInStr = myStr[0] // første char i string
    var lastCharInStr = myStr[myStr.length - 1] // sidste char i string
    var myLength = myStr.length

    println("Første tegn i myStr $firstCharInStr")
    // kan også skrives: println("Første tegn i myStr " + firstCharInStr)
    println("Sidste tegn i string $lastCharInStr")
    // kan også skrives: println("Sidste tegn i string " + lastCharInStr)
    println("Første tegn er: $firstCharInStr, det sidste er: $letterChar og det total er: $myLength")

    // var (variables) kan overskrives.
    // val (value) kan ikke overskrives.
    // val (value) kræver mindre secourser fordi det er statisk.
    //TODO: Add new function
    /*
    Multiline comment
    */

    println("Hello " + myName)

    // Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result /= 2
    // kan skrives: result = result / 2
    result *= 2
    result +=3
    result -=4

    var result2 = 5+3
    result2 = 15%2 // Giver det tilbageværende efter at den har divideret første tal med andet tal

    var result3 = 6-9
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b

    println("Result = $result")
    println("Result2 = $result2")
    println("Result3 = $result3")
    println("ResultDouble = $resultDouble")

    // Comparison operators (==, !=, <, >, <=, >=)
    var isEqual = 5==3 // sammenligner dem med hinanden - giver boolean (true/false)
    val isNotEqual = 5!=5 // 5 må ikke være 5 grundet != - giver boolean (true/false)

    // String interpolation
    println("isEqual is $isEqual")
    println("isNotEqual is $isNotEqual")
    println("is5GreaterThat3: ${5>3}")
    println("is-5GreaterThat3: ${-5>3}")
    println("is5LowerEqual3: ${5 <= 3}") // 5 skal værre lavere eller ens med 3
    println("is5GreaterEqual3: ${5 >= 3}") // 5 skal være større eller ens med 3

    // Assignment operators ( +=, -=, *=, /=, %= )
    var myNum = 5
    myNum += 3

    println("myNum is: $myNum")

    myNum *= 4
    println("myNum is after multiplication whit 4: $myNum")

    // Increment and decrement operators (++, --)
    myNum ++
    println("mynum is after increment: $myNum")
    // kan skrives: println("mynum is after increment: ${++myNum}") for increment uden at lave myNum++ inden
    myNum --
    println("myNum is after decrement: $myNum")
    // kan skrives: println("mynum is after decrement: ${--myNum}") for decrement uden at lave myNum-- inden

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("use raw force")
    }
    else if (heightPerson1 == heightPerson2){
        println("Run!")
    }
    else{
        println("use technique")
    }

    var age = 15
    val drinkingAge = 21
    val votingAge = 18
    val drivingAge = 16

    if ( age >= drinkingAge){
        println("You may drink in USA")
    }
    else if (age >= votingAge){
        println("You may vote in USA")
    }
    else if (age >= drivingAge){
        println("You may drive in USA")
    }
    else{
        println("Grow up!")
    }

    when (age){
        in 21..100 -> println("You may dring in USA")
        in 18..20 -> println("You may vote in USA")
        16, 17 -> println("You may drive in USA")
        else -> println("Grow up!")
    }
    // kan skrives på følgende måde også
    when (age){
        !in 0..20 -> println("You may dring in USA") // betyder at det interval kun kører hvis den er udenfor dette spektrum
        !in 0..17 -> println("You may vote in USA")
        !in 0..16 -> println("You may drive in USA")
        else -> println("Grow up!")
    }

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> { // Hvis man vil have flere ting i
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring") // month 3 to 5
        in 6..8 -> println("Summer") // month 6 to 8
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter") // reacts to 12, 1 and 2
        else -> println("Invalid month")
    }

    var x : Any = 13.37 // x : Any -> betyder at programmet selv kan finde ud af hvilken type at den er
    when(x){
        is Int -> println("$x is aInteger")
        is Double -> println("$x is a Double") // lavede man ! inden is, så ville man få dette  som svar hvis det ikke var en Double
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var x2 = 1
    while (x2 <= 10){ // kører konstant så længe x er under eller lig med 10
        print("$x2 ")
        x2++
    }
    println("\nLoop is done") // \n er linebreak

    var x3 = 100
    while (x3 >= 0){
        print("$x3 ") // udskriver nuværende tal
        x3 -= 2 // trækker 2 fra hver gang lØkken køres
    }
    println("\nLoop is done")

    var x4 = 6
    do { // kører kun indtil kriterierne er opfuldt for at while == false
        print("$x4 ")
        x4++
    }
    while (x4 <= 10) // bliver kørt mindst en gang, selvom while == false
    println("\nDo while loop is done")

    var feltTemp = "Cold"
    var roomTemp = 10

    while (feltTemp == "Cold"){
        roomTemp++
        println("$roomTemp is stil cold")
        if (roomTemp >= 20){
            feltTemp = "comfy"
            println("Room temperature is comfy now")
        }
    }


}