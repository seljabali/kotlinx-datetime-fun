package kotlinxdatetimefun.localdatetime.extensions

import kotlinx.datetime.*

// region Day Comparisons
fun LocalDateTime.compareDay(toDate: LocalDateTime): Int {
    val dayDifference = this.getDayDifference(toDate)
    return when {
        dayDifference > 0 -> -1
        dayDifference < 0 -> 1
        else -> 0
    }
}

fun LocalDateTime.isEqualDay(b: LocalDateTime): Boolean = this.compareDay(b) == 0

fun LocalDateTime.isBeforeDay(b: LocalDateTime): Boolean = this.compareDay(b) < 0

fun LocalDateTime.isBeforeEqualDay(b: LocalDateTime): Boolean = this.compareDay(b) <= 0

fun LocalDateTime.isAfterDay(b: LocalDateTime): Boolean = this.compareDay(b) > 0

fun LocalDateTime.isAfterEqualDay(b: LocalDateTime): Boolean = this.compareDay(b) >= 0
// endregion

// region Month Comparisons
fun LocalDateTime.compareMonth(localDateTimeB: LocalDateTime): Int =
    when {
        this.isBeforeMonth(localDateTimeB) -> -1
        this.isEqualMonth(localDateTimeB) -> 0
        else -> 1
    }

fun LocalDateTime.isBeforeMonth(localDateTimeB: LocalDateTime): Boolean {
    if (this.year > localDateTimeB.year) return false
    if (this.year < localDateTimeB.year) return true
    return this.month < localDateTimeB.month
}

fun LocalDateTime.isBeforeEqualMonth(localDateTimeB: LocalDateTime): Boolean {
    if (this.year > localDateTimeB.year) return false
    if (this.year < localDateTimeB.year) return true
    return this.month <= localDateTimeB.month
}

fun LocalDateTime.isEqualMonth(localDateTimeB: LocalDateTime): Boolean =
    this.year == localDateTimeB.year && this.month == localDateTimeB.month

fun LocalDateTime.isAfterEqualMonth(localDateTimeB: LocalDateTime): Boolean {
    if (this.year > localDateTimeB.year) return true
    if (this.year < localDateTimeB.year) return false
    return this.month >= localDateTimeB.month
}

fun LocalDateTime.isAfterMonth(localDateTimeB: LocalDateTime): Boolean {
    if (this.year > localDateTimeB.year) return true
    if (this.year < localDateTimeB.year) return false
    return this.month > localDateTimeB.month
}
// endregion

// region Year Comparisons
fun LocalDateTime.compareYear(localDateTimeB: LocalDateTime): Int =
    this.year.compareTo(localDateTimeB.year)

fun LocalDateTime.isBeforeYear(localDateTimeB: LocalDateTime): Boolean =
    this.year < localDateTimeB.year

fun LocalDateTime.isBeforeEqualYear(localDateTimeB: LocalDateTime): Boolean =
    this.year <= localDateTimeB.year

fun LocalDateTime.isEqualYear(localDateTimeB: LocalDateTime): Boolean =
    this.year == localDateTimeB.year

fun LocalDateTime.isAfterEqualYear(localDateTimeB: LocalDateTime): Boolean =
    this.year >= localDateTimeB.year

fun LocalDateTime.isAfterYear(localDateTimeB: LocalDateTime): Boolean =
    this.year > localDateTimeB.year
// endregion

// region Time Comparisons
fun LocalDateTime.compareTime(toDate: LocalDateTime): Int = this.compareTo(toDate)

fun LocalDateTime.isEqualTime(b: LocalDateTime): Boolean = this.compareTime(b) == 0

fun LocalDateTime.isBeforeTime(b: LocalDateTime): Boolean = this.compareTime(b) < 0

fun LocalDateTime.isBeforeEqualTime(b: LocalDateTime): Boolean = this.compareTime(b) <= 0

fun LocalDateTime.isAfterTime(b: LocalDateTime): Boolean = this.compareTime(b) > 0

fun LocalDateTime.isAfterEqualTime(b: LocalDateTime): Boolean = this.compareTime(b) >= 0
// endregion

fun LocalDateTime.getPeriodDifference(localDateTimeB: LocalDateTime): DateTimePeriod =
    this.toInstant(TimeZone.UTC).periodUntil(localDateTimeB.toInstant(TimeZone.UTC), TimeZone.UTC)

fun LocalDateTime.getSecondDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).seconds

fun LocalDateTime.getMinuteDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).minutes

fun LocalDateTime.getHourDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).hours

fun LocalDateTime.getDayDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).days

fun LocalDateTime.getMonthDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).months

fun LocalDateTime.getYearDifference(localDateTimeB: LocalDateTime): Int =
    this.getPeriodDifference(localDateTimeB).years