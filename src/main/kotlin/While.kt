package org.example

fun main() {
    var batteryLevel: Int = 100

    // Check first, then run
    while (batteryLevel > 0) {
        println("Battery level is $batteryLevel%")
        batteryLevel -= 25
    }

    batteryLevel = 100

    // First run, then check
    do {
        println("Battery level is $batteryLevel%")
        batteryLevel -= 25
    } while (batteryLevel > 0)

    val favNumber: Int = 8
    var number: Int = 12

    // Brakes
    while (number > 0) {
        println(number)

        if (number == favNumber) {
            println("This is my favorite number $favNumber")
            break
        }

        number -= 1
    }

    number = 12

    // Continue
    while (number > 0) {
        number -= 1

        if (number == favNumber) {
            println("This is my favorite number $favNumber")
            continue
        }

        // If the previous condition is met, this block of code never runs, so only print the previous text,
        // it shows the favorite number just one time
        println(number)
    }
}