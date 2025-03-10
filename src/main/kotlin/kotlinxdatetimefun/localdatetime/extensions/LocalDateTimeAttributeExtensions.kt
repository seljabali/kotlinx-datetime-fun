package kotlinxdatetimefun.localdatetime.extensions

import kotlinx.datetime.LocalDateTime

fun LocalDateTime.isInLeapYear(): Boolean = when {
    year % 4 != 0 -> false
    year % 100 == 0 -> year % 400 == 0
    else -> true
}

fun LocalDateTime.isAtStartOfDay(): Boolean = this.isEqualTime(this.atStartOfDay())

fun LocalDateTime.isAtEndOfDay(): Boolean = this.isEqualTime(this.atEndOfDay())

fun LocalDateTime.getMonthBaseZero(): Int = this.monthNumber - 1

fun LocalDateTime.getDaysInMonth(): Int = this.month.length(isInLeapYear())