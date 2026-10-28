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
}