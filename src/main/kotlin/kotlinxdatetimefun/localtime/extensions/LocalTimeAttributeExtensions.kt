package kotlinxdatetimefun.localtime.extensions

import kotlinx.datetime.LocalTime

fun LocalTime.isAtStartOfDay(): Boolean = this == LocalTime.MIN

fun LocalTime.isAtEndOfDay(): Boolean = this == LocalTime.MAX

fun LocalTime.isInAm(): Boolean = this.isBeforeTime(LocalTime.NOON)

fun LocalTime.isInPm(): Boolean = this.isAfterEqualTime(LocalTime.NOON)