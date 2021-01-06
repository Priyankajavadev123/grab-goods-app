object OrderService {
    val stockMap = mapOf("Apple" to 20, "Orange" to 15, "Guava" to 2)
    private val priceMap = mapOf("Apple" to 0.60, "Orange" to 0.25, "Guava" to 0.30)

    fun calculateBill(
        itemsWithCount: Map<String, Int>
    ): Double {
        var total = 0.0
        itemsWithCount.keys.forEach { k ->
            total += priceMap.getOrDefault(k, 0.0) * applyOffer(itemsWithCount, k)
        }
        println("Total \t\t\t: " + String.format("%.2f", total))
        return total
    }

    private fun applyOffer(
        itemsWithCount: Map<String, Int>,
        k: String
    ): Int {
        val offersMap = mapOf("Apple" to Offer.BUY1_GET1, "Orange" to Offer.THREE_FOR_TWO)
        val numerator = offersMap.getOrDefault(k, Offer.NONE).numerator
        val denominator = offersMap.getOrDefault(k, Offer.NONE).denominator
        val count = itemsWithCount.getOrDefault(k, 0)

        return ((count / denominator) * numerator) + (count % denominator)
    }

    fun processOrder(
        input: String?
    ): Map<String, Int>? {
        val itemsWithCount: Map<String, Int> = input!!.split(",").map { it.trim() }.groupingBy { it }.eachCount()
        itemsWithCount.forEach { (k, v) ->
            if (stockMap.getOrDefault(k, 0) < v) {
                NotificationService.publish(OrderStatus("Some item(s) of Order are Out Of Stock"))
                return null
            }
        }
        NotificationService.publish(OrderStatus("Order Received"))
        println("\n\n")
        println("========================")
        println("GrabGoods OnlineShopping")
        println("======= ORDER ==========")
        itemsWithCount.forEach { (k, v) -> println("$k \t($v) \t: " + priceMap.getOrDefault(k, 0.0)) }
        println("========================")
        return itemsWithCount
    }
}