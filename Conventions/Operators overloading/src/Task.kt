import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval,1)
operator fun MyDate.plus(multiTimeInterval: MultiTimeInterval): MyDate = this.addTimeIntervals(multiTimeInterval.timeInterval,multiTimeInterval.number)

data class MultiTimeInterval(val timeInterval: TimeInterval, val number:Int)

operator fun TimeInterval.times(number: Int): MultiTimeInterval = MultiTimeInterval(this,number)


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
