package com.cs

/**
 * functions
 *   -return type inference
 *  - one liner function
 *  - void function : Unit is optional (expression)
 *  - default argument
 *  - named parameter
 *  - varargs and spread operator
 *  - destructuring
 *  - extension function
 *  - infix function
 */

class Student2{
    fun isPass(marks: Int) = marks > 40
}

fun Student2.isScoler(marks: Int) = marks > 90

fun String.toLowerCase()= this.uppercase()

fun main4() {

    val greet= "hello"
    println("${greet.toLowerCase()}")



    val student =  Student2()
    println("${student.isPass(41)}")
    println("${student.isScoler(41)}")

    greet("Kotlin")
    greet( greet="Hello", name="Kotlin")

    val arry = intArrayOf(1,4,5,7,8,9,10)
    println(max(1, 3, 4, 7, 2, 1, *arry))


    val number = listOf<Int>(1, 2, 3, 4, 5) // 2, 4 // 4. 8
    //2,8

    number.filter { it % 2 == 0 }.map { it * 2 }.forEach(::println)
}













//int ... values
fun max(vararg  numbers: Int): Int {
      return  numbers.reduce{ max,  e-> if(e> max) e else max}
}
fun greet(name:String, greet: String="Hi"){
    println("$greet $name")
}



/*
*   FUNCTIONS as Expressions
* */
fun main(args: Array<String>) {

    var largeValue = max(4, 6)

    println("The greater number is $largeValue")
}

fun max(a: Int, b: Int): Int
        = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$b is greater")
    b
}


//defualt argument
//named parameter
fun main2(args: Array<String>) {

    var result = findVolume(2, 3)
    print(result)
}

fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {

    return length * breadth * height
}

fun findTheVolume(length: Int, breadth: Int, height: Int = 10): Int {

    return length * breadth * height
}


fun main3() {

    val student = Student()
    println("${student.hasPassed(41)}")
    println("${student.isScoler(41)}")
}

fun Student.isScoler(marks : Int): Boolean{
    return marks > 90
}


class Student{
    fun hasPassed(marks : Int): Boolean{
        return marks > 40
    }
}