package com.example.kotlinbasics

data class User(val id: Long, var name: String) // et forudbestemt element med information om hvilke værdier den skal indeholde
                                                // dette bruges til at kunne lave ens data classes senere i koden
                                                // parametre

fun main(){
    val user1 = User(1,"Martin")

    //val name = user1.name
    //println(name)
    user1.name = "Bob"

    val user2 = User(1, "Bob")
    println(user1 == user2)

    println("User details: $user1")

    val updateUser = user1.copy(name = "Martin Rohde") // kopierer hele user1 og udskifter name
    println(updateUser)

    println(updateUser.component1()) // første værdi i user1
    println(updateUser.component2()) // anden værdi i user1

    val (id, name) = updateUser
    println("id: $id, name: $name")

}