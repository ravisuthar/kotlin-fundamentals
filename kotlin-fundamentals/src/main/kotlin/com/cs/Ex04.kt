package com.cs

/**
 * data class
 * equals ==
 * reference types ===
 */
fun main(args: Array<String>) : Unit{
    var name ="Kotlin"
    //println(name.javaClass)
   // println(name::class) //Need to check

    name="Java"

    println("Hi"== "Hi")
    println("Hi" === "Hi")

    val message: Any = say()
    println("$message Ravi")
}

fun say() : Unit= print("Hello")

