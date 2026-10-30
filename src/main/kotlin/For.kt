package org.example

fun main() {
    val number: Int = 2

    for (multiplier in 1..10){
        println("${number}x${multiplier} = ${number * multiplier}")
    }
}