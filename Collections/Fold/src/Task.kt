// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return this.customers.fold(HashMap<Product,Int>(),{
        productToCustomer, customer ->
        customer.orders.flatMap { it.products }.forEach {
            productToCustomer.compute(it) { _, count -> (count ?: 0) + 1 }
        }
        productToCustomer
    }).entries.fold(HashSet(),{
        orderedByAll, product ->
        if(product.value == this.customers.size) orderedByAll.add(product.key)
        orderedByAll
    })
}
