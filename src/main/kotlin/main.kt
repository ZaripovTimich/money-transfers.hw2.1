
fun main() {
    val amount = 2.0
    val commission = 0.0075
    var result: Double = amount * commission

    if (result < 35.00) {
        result = 35.00
    }
    println("Сумма перевод с комиссией: ${amount + result} Руб")
}