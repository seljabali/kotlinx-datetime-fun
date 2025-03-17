package kotlinxdatetimefun.localdatetime

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.Month
import kotlinxdatetimefun.localtime.MIN

fun LocalDateTime.Companion.of(
    year: Int,
    month: Int = 1,
    dayOfMonth: Int = 0,
    hour: Int = 0,
    minute: Int = 0,
    second: Int = 0,
    nanosecond: Int = 0
): LocalDateTime = LocalDateTime(
    year = year,
    month = Month(month),
    dayOfMonth = dayOfMonth,
    hour = hour,
    minute = minute,
    second = second,
    nanosecond = nanosecond
)

fun LocalDateTime.Companion.of(
    year: Int,
    month: Int = 1,
    dayOfMonth: Int = 0,
    localTime: LocalTime = LocalTime.MIN
): LocalDateTime = LocalDateTime(
    year = year,
    month = Month(month),
    dayOfMonth = dayOfMonth,
    hour = localTime.hour,
    minute = localTime.minute,
    second = localTime.second,
    nanosecond = localTime.nanosecond
)