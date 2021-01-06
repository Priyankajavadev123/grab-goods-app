import kotlin.reflect.KClass

object NotificationService {
    val subscribers: MutableMap<KClass<*>, (Any) -> Unit> = mutableMapOf()

    inline fun <reified T : Any> publish(event: T) {
        subscribers[T::class]?.invoke(event)
    }

    inline fun <reified T> subscribe(noinline subscriber: (T) -> Unit) {
        subscribers[T::class] = subscriber as (Any) -> Unit
    }
}

data class OrderStatus(val msg: String)

fun main() {
    NotificationService.subscribe { status: OrderStatus -> println("Message: ${status.msg}") }
    NotificationService.publish(OrderStatus("Order Received"))
    NotificationService.publish(OrderStatus("Some item(s) of Order are Out Of Stock"))
}