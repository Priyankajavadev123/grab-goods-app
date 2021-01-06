import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class OrderServiceKtTest {
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calcBillWithOneItem() {
        val itemsWithCount: Map<String, Int> = mapOf("Apple" to 1, "Orange" to 1, "Guava" to 1)
        assertEquals(1.15, OrderService.calculateBill(itemsWithCount), 0.0)
    }

    @Test
    fun calcBillWithMultipleItems() {
        val itemsWithCount: Map<String, Int> = mapOf("Apple" to 2, "Orange" to 2, "Guava" to 1)
        assertEquals(2.0, OrderService.calculateBill(itemsWithCount), 0.0)
    }

    @Test
    fun testProcessOrder() {
        assertEquals(mapOf("Apple" to 1), OrderService.processOrder("Apple"))
        assertEquals(mapOf("Apple" to 2), OrderService.processOrder("Apple, Apple"))
        assertEquals(
            mapOf("Apple" to 2, "Guava" to 2, "Orange" to 1),
            OrderService.processOrder("Apple, Orange,Guava, Guava, Apple ")
        )
    }
}