fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection. groupBy { s -> s.length }

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.count() }.max()

    return groupsByLength.values.firstOrNull { group -> group.count() == maximumSizeOfGroup }
}
