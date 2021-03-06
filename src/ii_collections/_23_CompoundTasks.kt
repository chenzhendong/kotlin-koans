package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> =
        customers.filter { it.orders.flatMap { it.products }.contains(product) }.toSet()


fun Customer.getMostExpensiveDeliveredProduct(): Product? =
        orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }
//{
//    // Return the most expensive product among all delivered products
//    // (use the Order.isDelivered flag)
//    todoCollectionTask()
//}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int=
        customers.flatMap { it.orders }.flatMap { it.products }.count {it==product }
//{
//    // Return the number of times the given product was ordered.
//    // Note: a customer may order the same product for several times.
//    todoCollectionTask()
//}
