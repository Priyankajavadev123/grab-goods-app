object OrderService {
    val stockMap = mapOf("Apple" to 20, "Orange" to 15, "Guava" to 2)
    private val priceMap = mapOf("Apple" to 0.60, "Orange" to 0.25, "Guava" to 0.30)

    fun calculateBill(
        itemsWithCount: Map<String, Int>
    ): Double {
        var total = 0.0
        itemsWithCount.keys.forEach { k ->
            total += priceMap.getOrDefault(k, 0.0) * itemsWithCount.getOrDefault(k, 0)
        }
        println("Total \t\t\t: " + String.format("%.2f", total))
        return total
    }

    fun processOrder(
        input: String?
    ): Map<String, Int> {
        val itemsWithCount: Map<String, Int> = input!!.split(",").map { it.trim() }.groupingBy { it }.eachCount()
        println("\n\n")
        println("========================")
        println("GrabGoods OnlineShopping")
        println("======= ORDER ==========")
        itemsWithCount.forEach { (k, v) -> println("$k \t($v) \t: " + priceMap.getOrDefault(k, 0.0)) }
        println("========================")
        return itemsWithCount
    }
}