package kotlinxdatetimefun.localtime

import kotlinx.datetime.LocalTime

val LocalTime.Companion.MIN get() = LocalTime(0, 0)
val LocalTime.Companion.NOON get() = LocalTime(12, 0)
val LocalTime.Companion.MAX get() = LocalTime(23, 59, 59, 999_999_999)