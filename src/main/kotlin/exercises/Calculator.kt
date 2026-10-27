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

const val TAX_RATE = 0.05
const val PERCENTAGE_BASE = 100

fun main() {
    val productName: String = "Leche Klim"
    val productPrice: Double = 23400.0
    val quantity: Int = 2
    val discountRate: Double = 0.1
    // val taxRate: Double = 0.05

    val subtotal: Double = productPrice * quantity
    val discountAmount: Double = subtotal * discountRate
    val subtotalWithDiscount: Double = subtotal - discountAmount

    val taxAmount: Double = subtotalWithDiscount * TAX_RATE
    val total: Double = subtotalWithDiscount + taxAmount

    println("Name: $productName")
    println("Price: $$productPrice")
    println("Quantity: $quantity")
    println("Discount: ${discountRate * PERCENTAGE_BASE}% (-$$discountAmount)")
    println()
    println("Subtotal (after discount): $$subtotalWithDiscount")
    println("Tax (${TAX_RATE * PERCENTAGE_BASE}%): $$taxAmount")
    println()
    println("Total: $$total")
}