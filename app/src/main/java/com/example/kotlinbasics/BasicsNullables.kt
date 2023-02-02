package com.example.kotlinbasics

fun main(){
    //var name :String = "Martin"
    //name = "Adam"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Martin" // ved at gøre dette (Brug af ?) gør vi at man sagtens kan gøre variablen null
    //nullableName = null

    //var len = name.length
    var len2 = nullableName?.length // den skal bruge ? for at kunne gøre dette med en null
                                    // kan også gøres på den måde der står nedenfor (if/else)
    // println(nullableName?.toLowerCase())
    // nullableName?.let { println(it.lenght) }
/*
    if (nullableName != null){
        var len2 = nullableName.length
    }
    else{
        null
    }
*/
    // ?: Elvis Operator
    val name = nullableName ?: "Guest"
    println("name is $name") // hvis man fjerne udkommentering på linje 8, så skriver den "name is Guest" i konsollen

    println(nullableName!!.toLowerCase())  // laver fejl hvis núllableName = null
                                            // Når toLowerCase() bruges, så udskriver den alt i lower case/små bogstaver
}