package com.cs

/**
 * When
 */

fun main() {

    process1(1)
    process1(7)
    process1(8)
    process1(16)
    process1("Kotlin")
    process1(StringBuilder("Anything"))
}

fun process1(i: Any) {
    when (i) {
        1 -> println("one")
        7, 8, 9 -> println("7,8,9")
        in 13..19 -> println("teens")
        is String -> println("we got a string ${i.length}")
        else -> println("else")
    }
}


fun te(){

    //val x=13
    /* val name = when(x){
         1, 3, 5 ->  "in 1, 3, 5"
         in 13..20 -> "teen"
         else -> {
              "else"
         }
     }*/

    //println(name)

    val x = 100

    /*val str: String  = when (x) {

        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x value is unknown"
            "x is an alien"
        }
    }

    println(str)*/
}