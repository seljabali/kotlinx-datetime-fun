package kotlinxdatetimefun.localtime.extensions

import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinxdatetimefun.localdatetime.extensions.getPeriodDifference
import kotlinxdatetimefun.localdatetime.extensions.withLocalTime
import kotlinxdatetimefun.localdatetime.of

// region Time Comparisons
fun LocalTime.compareTime(toDate: LocalTime): Int =
    when {
        isEqualTime(toDate) -> 0
        isBeforeTime(toDate) -> -1
        else -> 1
    }

fun LocalTime.isEqualTime(b: LocalTime): Boolean = this.getNanoSecondDifference(b) == 0

fun LocalTime.isBeforeTime(b: LocalTime): Boolean = this.getNanoSecondDifference(b) < 0

fun LocalTime.isBeforeEqualTime(b: LocalTime): Boolean = compareTime(b) <= 0

fun LocalTime.isAfterTime(b: LocalTime): Boolean = compareTime(b) > 0

fun LocalTime.isAfterEqualTime(b: LocalTime): Boolean = compareTime(b) >= 0
// endregion

fun LocalTime.periodUntil(localTimeB: LocalTime): DateTimePeriod {
    val localDateTimeA = LocalDateTime.of(2025, 1, 1).withLocalTime(this)
    val localDateTimeB = LocalDateTime.of(2025, 1, 1).withLocalTime(localTimeB)
    return localDateTimeA.getPeriodDifference(localDateTimeB)
}

fun LocalTime.getNanoSecondDifference(localTimeB: LocalTime): Int =
    this.periodUntil(localTimeB).nanoseconds

fun LocalTime.getMilliSecondDifference(localTimeB: LocalTime): Int =
    this.periodUntil(localTimeB).nanoseconds / 1_000_000

fun LocalTime.getSecondDifference(localTimeB: LocalTime): Int =
    this.periodUntil(localTimeB).seconds

fun LocalTime.getMinuteDifference(localTimeB: LocalTime): Int =
    this.periodUntil(localTimeB).minutes

fun LocalTime.getHourDifference(localTimeB: LocalTime): Int =
    this.periodUntil(localTimeB).hours