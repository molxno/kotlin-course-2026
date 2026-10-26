package org.example

fun main() {
    val name = "Santiago"
    val age = 23

    // Concatenation
    println("Hello, " + name + "! You are " + age + " years old.")

    // Template
    println("Hello, $name! You are $age years old.")

    // Operation with concatenation
    val price: Double = 50.00
    val quantity: Int = 2
    println("Total cost: $" + (price * quantity))

    // Operation with template
    println("Total cost: $${price * quantity}")
    val adult: Int = 18
    println("is of legal age? R: ${age >= adult}")

    // Line break
    println("This is a \n line break")

    // Tabulation
    println("This is a \t tabulation")

    // Double quotes
    println("This is a \"double quotes\"")

    // Conversion
    val number1: Int = 10
    val number2: String = "8"
    println("The result of addition with conversion to int is ${number1 + number2.toInt()}")
    println("The result of addition with conversion to string is ${number1.toString() + number2}")
}