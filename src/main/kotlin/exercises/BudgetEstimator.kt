package org.example.exercises

import java.math.BigDecimal
import java.text.DecimalFormat

/**
PROYECTO FINAL — CALCULADORA COMPLETA DE PRESUPUESTOS

Crea un programa en Kotlin que genere el presupuesto completo de un proyecto
de desarrollo de software.

El presupuesto debe incluir los siguientes datos:

- Nombre de la empresa.
- Nombre del cliente.
- Nombre del proyecto.
- Precio por hora.
- Número de horas estimadas.
- Coste del diseño.
- Coste de las licencias.
- Otros gastos.
- Porcentaje para imprevistos.
- Porcentaje de descuento.
- Porcentaje de impuestos.
- Porcentaje del pago inicial.

El programa debe calcular:

1. Coste total del trabajo según las horas estimadas.
2. Suma de todos los costes adicionales.
3. Precio base del proyecto.
4. Cantidad añadida para imprevistos.
5. Subtotal antes del descuento.
6. Cantidad descontada.
7. Precio después del descuento.
8. Cantidad correspondiente a los impuestos.
9. Precio final del presupuesto.
10. Cantidad que debe pagarse inicialmente.
11. Cantidad que quedará pendiente.


Fórmulas necesarias:

- Coste del trabajo: precio por hora multiplicado por el número de horas estimadas.
- Costes adicionales: suma del coste del diseño, el coste de las licencias y otros gastos.
- Precio base: suma del coste del trabajo y los costes adicionales.
- Cantidad para imprevistos: precio base multiplicado por el porcentaje de imprevistos y dividido entre la base porcentual.
- Subtotal: suma del precio base y la cantidad añadida para imprevistos.
- Cantidad descontada: subtotal multiplicado por el porcentaje de descuento y dividido entre la base porcentual.
- Precio después del descuento: subtotal menos la cantidad descontada.
- Cantidad de impuestos: precio después del descuento multiplicado por el porcentaje de impuestos y dividido entre la base porcentual.
- Precio final: precio después del descuento más la cantidad de impuestos.
- Pago inicial: precio final multiplicado por el porcentaje del pago inicial y dividido entre la base porcentual.
- Cantidad pendiente: precio final menos el pago inicial.

Requisitos:

- Utiliza nombres de variables claros y descriptivos.
- Utiliza val siempre que el valor no necesite modificarse.
- Guarda como constantes las reglas generales del presupuesto.
- Utiliza Int para cantidades enteras y Double para precios y porcentajes.
- Evita utilizar números o textos mágicos directamente en los cálculos.
- Divide los cálculos en pasos pequeños y fáciles de entender.
- Muestra al final un resumen completo mediante String.

No utilices todavía:

- Funciones adicionales.
- Condicionales.
- Bucles.
- Clases.
- Lectura de datos por consola.
 */

const val COMPANY = "Tecnicopa"

fun main() {
    val client = "Supermercado \"El Baratillo\""
    val project = "CRM"
    val costPerHour: Double = 30000.00
    val estimatedHours: Double = 730.49
    val designCost: Double = 1000000.00
    val licensingCost: Double = 500000.00
    val otherCosts: Double = 180000.00

    val contingencies: BigDecimal = BigDecimal(0.2)
    val discountPercentage: BigDecimal = BigDecimal(0.07)
    val taxesPercentage: BigDecimal = BigDecimal(0.05)
    val initialPaymentPercentage: BigDecimal = BigDecimal(0.5)
    val percentageBase: BigDecimal = BigDecimal(100.00)

    val money = DecimalFormat("#,###.##")
    val percentage = DecimalFormat("##.#")

    println("Cotización $COMPANY")
    println()
    println("Presupuesto de $project para $client")
    println()
    println("\tCosto por hora: $${money.format(costPerHour)}")
    println("\tHoras estimadas: $estimatedHours")
    println()

    var subtotal: BigDecimal = BigDecimal(costPerHour * estimatedHours)
    println("Total costo de trabajo: $${money.format(subtotal)}")
    println()

    val totalAdditionalCosts: BigDecimal = BigDecimal(designCost + licensingCost + otherCosts)
    subtotal += totalAdditionalCosts
    println("\tCosto de diseño: $${money.format(designCost)}")
    println("\tCosto de licencias: $${money.format(licensingCost)}")
    println("\tCosto de otros gastos: $${money.format(otherCosts)}")
    println()
    println("Total costos adicionales (diseño, licencias, otros): $${money.format(totalAdditionalCosts)}")
    println()
    println("Total precio base (Costo trabajo + costos adicionales): $${money.format(subtotal)}")
    println()

    val contingencyFund = subtotal * contingencies
    subtotal += contingencyFund
    println("\tImprevistos: ${percentage.format(contingencies * percentageBase)}% (+$${money.format(contingencyFund)})")
    println()

    val discountFund = subtotal * discountPercentage
    subtotal -= discountFund
    println("\tDescuento: ${percentage.format(discountPercentage * percentageBase)}% (-$${money.format(discountFund)})")
    println()
    println("Subtotal: $${money.format(subtotal)}")
    println()

    val taxFund = subtotal * taxesPercentage
    println("\tImpuesto: ${percentage.format(taxesPercentage * percentageBase)}% (+$${money.format(taxFund)})")
    println()
    println("---------------------------------------------")
    println()

    val total = subtotal + taxFund
    println("Total: $${money.format(total)}")

    val initialPayment = total * initialPaymentPercentage
    println("Pago inicial: ${percentage.format(initialPaymentPercentage * percentageBase)}% ($${money.format(initialPayment)})")

    val debt = total - initialPayment
    println("Deuda restante: $${money.format(debt)}")
}