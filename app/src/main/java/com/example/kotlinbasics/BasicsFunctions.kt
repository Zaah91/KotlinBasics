package com.example.kotlinbasics

fun main(){
    myFunction()

    // arguments
    // laver result til var og kalder funktionen addUp, med 5 og 3 som variabler der er sendt med til funktionen
    var result = addUp(5,3)
    println("Result is $result")
}

fun myFunction(){
    println("Called from myFunction")
}

// Parameters (input)
fun addUp(a:Int, b:Int) : Int{
    // output
    return a+b
}