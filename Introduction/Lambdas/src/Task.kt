fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    0 == it % 2
}
