package org.example.exercises

/**
 * This class provides a product market calculator
 * The calculator should receive the following parameters:
 * - productName: The name of the product
 * - productPrice: The price of the product by unit
 * - quantity: The quantity of the product
 * - discount: The discount of the product
 * - taxes: The taxes of the product
 */
fun main() {
    val productName = "Leche Klim"
    val productPrice = 23400.0
    val quantity = 2
    val discountRate = 0.1
    val taxRate = 0.05

    val subtotal = productPrice * quantity
    val discountAmount = subtotal * discountRate
    val subtotalWithDiscount = subtotal - discountAmount

    val taxAmount = subtotalWithDiscount * taxRate
    val total = subtotalWithDiscount + taxAmount

    println("Name: $productName")
    println("Price: $$productPrice")
    println("Quantity: $quantity")
    println("Discount: ${discountRate * 100}% (-$$discountAmount)")
    println()
    println("Subtotal (after discount): $$subtotalWithDiscount")
    println("Tax (${taxRate * 100}%): $$taxAmount")
    println()
    println("Total: $$total")
}