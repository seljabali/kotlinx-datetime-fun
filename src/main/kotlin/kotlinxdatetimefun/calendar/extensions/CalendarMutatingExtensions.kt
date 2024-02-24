package kotlinxdatetimefun.calendar.extensions

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinxdatetimefun.localdate.LocalDateUtil
import kotlinxdatetimefun.localdatetime.LocalDateTimeUtil
import kotlinxdatetimefun.localtime.LocalTimeUtil
import java.util.Calendar

fun Calendar.toLocalDateTime(): LocalDateTime =
    LocalDateTimeUtil.new(this.toInstant().toEpochMilli())

fun Calendar.toLocalDate(): LocalDate =
    LocalDateUtil.new(this.toInstant().toEpochMilli())

fun Calendar.toLocalTime(): LocalTime =
    LocalTimeUtil.new(this.toInstant().toEpochMilli())
