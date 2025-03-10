package kotlinxdatetimefun.localdatetime

import kotlinx.datetime.*

fun LocalDateTime.Companion.nowUtc() = LocalDateTime.now(TimeZone.UTC)
fun LocalDateTime.Companion.todayUtc() = LocalDateTime.today(TimeZone.UTC)
fun LocalDateTime.Companion.yesterdayUtc() = LocalDateTime.yesterday(TimeZone.UTC)
fun LocalDateTime.Companion.tomorrowUtc() = LocalDateTime.tomorrow(TimeZone.UTC)

fun LocalDateTime.Companion.lastMondayUtc() = LocalDateTime.lastMonday(TimeZone.UTC)
fun LocalDateTime.Companion.lastTuesdayUtc() = LocalDateTime.lastTuesday(TimeZone.UTC)
fun LocalDateTime.Companion.lastWednesdayUtc() = LocalDateTime.lastWednesday(TimeZone.UTC)
fun LocalDateTime.Companion.lastThursdayUtc() = LocalDateTime.lastThursday(TimeZone.UTC)
fun LocalDateTime.Companion.lastFridayUtc() = LocalDateTime.lastFriday(TimeZone.UTC)
fun LocalDateTime.Companion.lastSaturdayUtc() = LocalDateTime.lastSaturday(TimeZone.UTC)
fun LocalDateTime.Companion.lastSundayUtc() = LocalDateTime.lastSunday(TimeZone.UTC)

fun LocalDateTime.Companion.nextMondayUtc() = LocalDateTime.nextMonday(TimeZone.UTC)
fun LocalDateTime.Companion.nextTuesdayUtc() = LocalDateTime.nextTuesday(TimeZone.UTC)
fun LocalDateTime.Companion.nextWednesdayUtc() = LocalDateTime.nextWednesday(TimeZone.UTC)
fun LocalDateTime.Companion.nextThursdayUtc() = LocalDateTime.nextThursday(TimeZone.UTC)
fun LocalDateTime.Companion.nextFridayUtc() = LocalDateTime.nextFriday(TimeZone.UTC)
fun LocalDateTime.Companion.nextSaturdayUtc() = LocalDateTime.nextSaturday(TimeZone.UTC)
fun LocalDateTime.Companion.nextSundayUtc() = LocalDateTime.nextSunday(TimeZone.UTC)