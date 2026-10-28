package org.example

fun main() {
    val userRole: String = "Admin"

    // as condition expression
    val permission = if (userRole == "Admin") {
        "FULL ACCESS"
    } else if (userRole == "Editor") {
        "EDIT"
    } else if (userRole == "Viewer"){
        "VIEW"
    } else {
        "NONE"
    }

    // with when condition
    val permission2 =  when(userRole) {
        "Admin" -> "FULL ACCESS"
        "Editor" -> "EDIT"
        "Viewer" -> "VIEW"
        else -> "NONE"
    }

    println("Permission 1: $permission")
    println("Permission 2: $permission2")

    val level = 8
    when {
        level > 0 && level <= 3 -> print("Noob")
        level > 3 && level <= 5 -> print("Beginner")
        level > 5 && level <= 8 -> print("Intermediate")
        level > 8 -> print("El nene")
        else -> print("no level")
    }

    val myRange: IntRange = 0..10

    when(level) {
        !in -100..0 -> print("")
        in 0..3 -> print("Noob")
        in 3..5 -> print("Beginner")
        in 5..8 -> print("Intermediate")
        in 8..9 -> print("El nene")
        else -> print("no level")
    }
}