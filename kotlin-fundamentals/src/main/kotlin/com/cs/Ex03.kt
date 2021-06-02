package com.cs

/**
 * Nullable types
 * Safe Call ( ?. )
 * Safe Call with let ( ?.let )
 * Non-null assertion operator ( !! )
 * Elvis-operator ( ?: )
 */
fun main() {
    val name: String? = null
    println("${name?.length}")
    println("${name ?: "No value"}")
    println(display(name))

    name?.let {
        println("is not null")
    }
}

//name?.department?.head?.name?.length
fun display(name: String?): String? {
    println("${name?.length}")
    return name
}



fun test() {

    val name: String? = null
    println("Length is ${name?.length}")

    println(nickName(name))
    println(nickName("Ravi")?.length)
}

fun nickName(name: String?): String?{
    return name?:"anything"
}