package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate>{
    override fun compareTo(other:MyDate): Int{
        return (year-other.year)*12*31+(month-other.month)*31+(dayOfMonth-other.dayOfMonth);
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
