package org.example

fun main() {
    // Val is a reserved word for Kotlin that indicates a value that never changes
    // Declaration
    val name: String = "Ferssan"

    // Var is a reserved work for Kotlin that indicates a value that could change
    var age: Int = 22
    println("Yesterday, $name was $age years old")

    // Reassignment
    age = 23

    println("Now, $name is $age years old")

    // You can define explicit type in variables or values as var/val variable_name: type
    // also with a default value like var/val key: type = value

    // Another var types:
    // Numeric
    val phone: Long = 3243638746
    val grade: Float = 3.33F
    val taxes: Double = 3.33333333
    //  Alphanumeric
    val password: String = "Pass2026!#"
    val genre: Char = 'M'
    // Boolean
    val isAdmin: Boolean = false
}