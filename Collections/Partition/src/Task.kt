// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    val undelivered = this.customers.filter{
        val (delivered, undelivered ) = it.orders.partition { it.isDelivered }
        undelivered.count() > delivered.count()
    }
    return undelivered.toSet()
}
