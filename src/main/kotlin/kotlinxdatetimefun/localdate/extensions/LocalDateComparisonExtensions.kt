package kotlinxdatetimefun.localdate.extensions

import kotlinx.datetime.LocalDate
import kotlinx.datetime.daysUntil
import kotlinx.datetime.monthsUntil
import kotlinx.datetime.yearsUntil

// region Day Comparisons
fun LocalDate.compareDay(toDate: LocalDate): Int {
    val dayDifference = this.getDayDifference(toDate)
    return when {
        dayDifference > 0 -> -1
        dayDifference < 0 -> 1
        else -> 0
    }
}

fun LocalDate.isEqualDay(b: LocalDate): Boolean = compareDay(b) == 0

fun LocalDate.isBeforeDay(b: LocalDate): Boolean = compareDay(b) < 0

fun LocalDate.isBeforeEqualDay(b: LocalDate): Boolean = compareDay(b) <= 0

fun LocalDate.isAfterDay(b: LocalDate): Boolean = compareDay(b) > 0

fun LocalDate.isAfterEqualDay(b: LocalDate): Boolean = compareDay(b) >= 0
// endregion

// region Month Comparisons
fun LocalDate.compareMonth(localDateB: LocalDate): Int =
    when {
        isBeforeMonth(localDateB) -> -1
        isEqualMonth(localDateB) -> 0
        else -> 1
    }

fun LocalDate.isBeforeMonth(localDateB: LocalDate): Boolean {
    if (this.year > localDateB.year) return false
    if (this.year < localDateB.year) return true
    return this.month < localDateB.month
}

fun LocalDate.isBeforeEqualMonth(localDateB: LocalDate): Boolean {
    if (this.year > localDateB.year) return false
    if (this.year < localDateB.year) return true
    return this.month <= localDateB.month
}

fun LocalDate.isEqualMonth(localDateB: LocalDate): Boolean =
    this.year == localDateB.year && this.month == localDateB.month

fun LocalDate.isAfterEqualMonth(localDateB: LocalDate): Boolean {
    if (this.year > localDateB.year) return true
    if (this.year < localDateB.year) return false
    return this.month >= localDateB.month
}

fun LocalDate.isAfterMonth(localDateB: LocalDate): Boolean {
    if (this.year > localDateB.year) return true
    if (this.year < localDateB.year) return false
    return this.month > localDateB.month
}
// endregion

// region Year Comparisons
fun LocalDate.compareYear(localDateB: LocalDate): Int = this.year.compareTo(localDateB.year)

fun LocalDate.isBeforeYear(localDateB: LocalDate): Boolean = this.year < localDateB.year

fun LocalDate.isBeforeEqualYear(localDateB: LocalDate): Boolean = this.year <= localDateB.year

fun LocalDate.isEqualYear(localDateB: LocalDate): Boolean = this.year == localDateB.year

fun LocalDate.isAfterEqualYear(localDateB: LocalDate): Boolean = this.year >= localDateB.year

fun LocalDate.isAfterYear(localDateB: LocalDate): Boolean = this.year > localDateB.year
// endregion

fun LocalDate.getNanoSecondDifference(localDateB: LocalDate): Int =
    this.getMilliSecondDifference(localDateB) * 1_000_000

fun LocalDate.getMilliSecondDifference(localDateB: LocalDate): Int =
    this.getSecondDifference(localDateB) * 1_000

fun LocalDate.getSecondDifference(localDateB: LocalDate): Int =
    this.getMinuteDifference(localDateB) * 60

fun LocalDate.getMinuteDifference(localDateB: LocalDate): Int =
    this.getHourDifference(localDateB) * 60

fun LocalDate.getHourDifference(localDateB: LocalDate): Int =
    this.daysUntil(localDateB) * 24

fun LocalDate.getDayDifference(localDateB: LocalDate): Int =
    this.daysUntil(localDateB)

fun LocalDate.getMonthDifference(localDateB: LocalDate): Int =
    this.monthsUntil(localDateB)

fun LocalDate.getYearDifference(localDateB: LocalDate): Int =
    this.yearsUntil(localDateB)