package com.cs

/**
 *  ..
 *  rangeTo
 *  until
 *  step
 *
 *  downTo
 *  iterate over list
 *  indices and withIndex()
 */
fun main23() {

    val list = listOf("A", "B", "C", "D")
    for (index in list.indices) {
        println("index: $index")
    }


    val (name, _) = getCart()
    println("Car year is: $name")
}

data class Car(val name:String, val model:Int)

fun getCart(): Car {
    return Car("Maruti", 2021)
}


fun main33() {
    //Range

    val r1: IntRange= 1..4

    for(i in r1){
        println(i)
    }

    val r2= 4..1

    val r4 = 1 until 10
    println(r4)
    val r3 = 5 downTo 1  // 5 4 3 2 1

    val r = 5 downTo 1 step 2 // 5 3 1

    val c1 = "a".."z"
    println(c1::class)

    val c4 = 'a'..'z'

    val isPresent = 'R' in c4
    print(isPresent)

//both syntax
    val r22= 10.downTo(2)
    val va23 = 1.rangeTo(10)


    //   var r1 = 1..5
    // This range contains number 1, 2, 3, 4, 5

    //  val r2 = 5 downTo 1
    // This range contains number 5, 4, 3, 2, 1

    //   val r3 = 5 downTo 1 step 2
    // This range contains number 5, 3, 1

    //  val r4 = 'a'..'z'
    // This range contains the values from "a", "b", "c" . . . "z"

    // var isPresent = 'c' in r4

    var countDown = 10.downTo(1)
    // This range contains number 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    var moveUp = 1.rangeTo(10)
    // This range contains number 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

}



//for loop
//break continue
// with indixce
fun main() {

    for(number in 1..10){
        println(number)
    }


    myloop@ for(number in 1..10){
        println(number)

        if(number==5)
            continue@myloop
    }

    //index?
    //break
    //continue

    val  list = listOf("A","B","C")
    for((index, value) in list.withIndex()){
        println("index is $index and value is $value")
    }

    //parameters are final
}
