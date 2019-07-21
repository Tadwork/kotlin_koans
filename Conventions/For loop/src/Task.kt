class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return DateIterator(this.start, this.end)
    }

    class DateIterator(start: MyDate, private val end: MyDate) : Iterator<MyDate> {
        private var current =  start
        override fun hasNext(): Boolean {
            return current <= end
        }

        override fun next(): MyDate {
            val previous = current
            current = current.nextDay()
            return previous
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
