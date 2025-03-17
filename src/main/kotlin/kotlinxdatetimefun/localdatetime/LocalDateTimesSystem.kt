package kotlinxdatetimefun.localdatetime

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone

fun LocalDateTime.Companion.nowSystem() = LocalDateTime.now(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.todaySystem() = LocalDateTime.today(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.yesterdaySystem() = LocalDateTime.yesterday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.tomorrowSystem() = LocalDateTime.tomorrow(TimeZone.currentSystemDefault())

fun LocalDateTime.Companion.lastMondaySystem() = LocalDateTime.lastMonday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastTuesdaySystem() = LocalDateTime.lastTuesday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastWednesdaySystem() = LocalDateTime.lastWednesday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastThursdaySystem() = LocalDateTime.lastThursday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastFridaySystem() = LocalDateTime.lastFriday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastSaturdaySystem() = LocalDateTime.lastSaturday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.lastSundaySystem() = LocalDateTime.lastSunday(TimeZone.currentSystemDefault())

fun LocalDateTime.Companion.nextMondaySystem() = LocalDateTime.nextMonday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextTuesdaySystem() = LocalDateTime.nextTuesday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextWednesdaySystem() = LocalDateTime.nextWednesday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextThursdaySystem() = LocalDateTime.nextThursday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextFridaySystem() = LocalDateTime.nextFriday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextSaturdaySystem() = LocalDateTime.nextSaturday(TimeZone.currentSystemDefault())
fun LocalDateTime.Companion.nextSundaySystem() = LocalDateTime.nextSunday(TimeZone.currentSystemDefault())