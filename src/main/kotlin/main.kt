
fun main() {
    val amount = 345256.45
    val commission = 0.0075
    val result: Double = amount * commission

    if (result < 35.00) {
        println("Сумма перевод с комиссией: ${amount + 35.00} Руб")
    } else {
        println("Сумма перевод с комиссией: ${amount + result} Руб")
    }
}