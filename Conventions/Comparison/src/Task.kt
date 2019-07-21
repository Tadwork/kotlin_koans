data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        other.year != this.year -> this.year - other.year
        other.month != this.month -> this.month - other.month
        else -> this.dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
