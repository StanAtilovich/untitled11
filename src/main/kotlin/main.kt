fun main() {
    val itemPrice = 100.0
    val itemCount = 500
    val discount = 100
    val discountStart = 1_000
    val discountFinish = 10_000
    val clientConstant = true

    val totalPrice = itemPrice * itemCount
    var result = if (totalPrice > discountStart && totalPrice < discountFinish) totalPrice - discount
    else totalPrice
    println("Скидка 100 рублей от 1 001 до 10 000 рублей составляет " + result)
    if (totalPrice > discountFinish) result -= totalPrice * 0.05
    println("Скидка 5% от 10001 рубль составляет " + result)
    if (clientConstant == true) result -= result * 0.01
    println("Т.к вы наш постоянный покупатель даем вам скидку постоянного покупателя "+ result)
}