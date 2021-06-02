package com.cs

object PersonUtils {
    fun getName() = "Kotlin"
}


class Teacher{

    companion object {
        val value: Int = 100
        fun getTeacher() = "teacher"
    }
}

fun main() {

    println(PersonUtils.getName())
    println(Teacher.getTeacher())
}