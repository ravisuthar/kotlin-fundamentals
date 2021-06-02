//@file:JvmName("MyCustomKotlin")

package com.cs

import java.io.File

/**
 * REPL - Real Evaluate Print Loop
 * Hello World
 * Semicolons are optional
 * Sensible warnings
 *       1. gradle build
 *       2. kotlinc -Werror Sample.kt
 * Type Inference
 * date types
 * var and val
 * String template / String intepolation
 * Multiline String
 * Expression over Statements
 *
 */
fun main(args: Array<String>) {
    println("Hello Kotlin!!")
    //   HelloJava.main(args)

    var greet = "Hello" //val : immutable, val = mutalble variable.
    //print(greet+" Ravi"+ " ")
    print("$greet Ravi")

    val message = """ This is first line
        ~second line $greet
        ~third ...
    """.trimMargin()
    print("$message")

    val age = 18
    val canVote = if (age > 18) "Can Vote" else "Cannot"
    val value = try {
        File("").absoluteFile
    } catch (e: Exception) {
        ""
    }




    val byteValue: Byte = 127
    val shortValue: Short = 32169
    val intValue: Int = Int.MAX_VALUE
    val longValue: Long = 123L
    val floatValue: Float = 1.2F
    val doubleValue: Double = 1.2
    val charValue: Char = 'A'
    val charValue2: Char = '\u0123'
    val isAlive: Boolean = true
}

fun canVote(age: Int)= try {
     File.pathSeparator
    } catch (e: Exception) {
         ""
    }


fun display(): String {
    print("hello")
    return "Kotlin"
}

//


fun printMax() {
    val a = 2

    val b = 5

    var maxValue: Int = if (a > b) {
        print("a is greater")
        a
    } else {
        print("b is greater")
        b
    }

    println(maxValue)

}
