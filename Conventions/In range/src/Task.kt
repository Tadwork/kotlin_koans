class DateRange(val start: MyDate, val endInclusive: MyDate)
operator fun DateRange.contains(date: MyDate) : Boolean {
    return date >= this.start && date <= this.endInclusive
}
fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
