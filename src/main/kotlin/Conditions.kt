package org.example

const val LEGAL_AGE = 18
const val YOUNG_PERSON = 15
const val KID = 5

fun main() {
    val age: Int = 18
    val isAdmin: Boolean = true
    val isDev: Boolean = false

    if (age < KID) {
        println("Is a baby")
    } else if (age < YOUNG_PERSON) {
        println("Is a kid")
    } else if (age < LEGAL_AGE) {
        println("Is a young person")
    } else {
        println("Is of legal age")
    }

    if (isAdmin) {
        println("Is admin")
    } else {
        println("Is not an admin")
    }

    if (!isDev) {
        println("Is not a dev")
    } else {
        println("Is a dev")
    }

    val genre = "male"

    // var or val as a condition expression
    val greeting = if (genre == "male") {
        "Hey mate"
    } else {
        "Hello lady"
    }

    println(greeting)
}