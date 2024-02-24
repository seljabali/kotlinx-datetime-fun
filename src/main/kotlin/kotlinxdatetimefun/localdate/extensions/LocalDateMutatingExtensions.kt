package kotlinxdatetimefun.localdate.extensions

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime

fun LocalDate.getLast(dayOfWeek: DayOfWeek, countingInThisDay: Boolean = false): LocalDate {
    if (countingInThisDay && this.dayOfWeek == dayOfWeek) {
        return this
    }
    var mostRecentDay = this
    if (mostRecentDay.dayOfWeek == dayOfWeek) {
        mostRecentDay = mostRecentDay.minusDays(1)
    }
    while (mostRecentDay.dayOfWeek != dayOfWeek) {
        mostRecentDay = mostRecentDay.minusDays(1)
    }
    return mostRecentDay
}

fun LocalDate.getNext(dayOfWeek: DayOfWeek, countingInThisDay: Boolean = false): LocalDate {
    if (countingInThisDay && this.dayOfWeek == dayOfWeek) {
        return this
    }
    var nextLocalDate = this
    if (nextLocalDate.dayOfWeek == dayOfWeek) {
        nextLocalDate = nextLocalDate.plusDays(1)
    }
    while (nextLocalDate.dayOfWeek != dayOfWeek) {
        nextLocalDate = nextLocalDate.plusDays(1)
    }
    return nextLocalDate
}

fun LocalDate.atEndOfDay(): LocalDateTime = LocalDateTime.of(this, LocalTime.MAX)
