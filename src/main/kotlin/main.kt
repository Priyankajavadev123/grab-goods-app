fun main() {
    println("Available Stock ${OrderService.stockMap} \n")

    // Assuming we won't enter Wrong Item names
    println("Please input your order with comma separated goods \n")
    var input: String?
    do {
        input = readLine()
        if (!input.isNullOrBlank()) break
    } while (true)

    val itemsWithCount: Map<String, Int> = OrderService.processOrder(input)
    OrderService.calculateBill(itemsWithCount)
}