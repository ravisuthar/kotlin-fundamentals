package com.cs

class Robot {
    infix fun turn(direction: String) {
        println("turning $direction")
    }

    infix fun run(direction: String) {
        println("running $direction")
    }
}

class Pizza{
    infix fun spreding(name: String){
        print("spereading $name")
    }
}

fun main() {
    val robot = Robot()
    robot turn "Left"
    robot run "slow"
    robot turn "Right"
    robot run "fast"


    val pizza = Pizza()
    pizza spreding "Cheese"
    pizza spreding "Onion"
    pizza spreding "Olive"
}


