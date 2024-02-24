package kotlinxdatetimefun.localdate.extensions

import kotlinx.datetime.LocalDate


fun LocalDate.isInLeapYear(): Boolean = Year.of(year).isLeap

fun LocalDate.getMonthBaseZero(): Int = this.monthValue - 1

fun LocalDate.getDaysInMonth(): Int = this.month.length(isInLeapYear())