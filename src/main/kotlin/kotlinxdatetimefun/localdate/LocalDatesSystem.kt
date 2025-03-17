package kotlinxdatetimefun.localdate

import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone

fun LocalDate.Companion.nowSystem(): LocalDate = LocalDate.now(TimeZone.currentSystemDefault())
fun LocalDate.Companion.todaySystem(): LocalDate = LocalDate.today(TimeZone.currentSystemDefault())
fun LocalDate.Companion.yesterdaySystem(): LocalDate = LocalDate.yesterday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.tomorrowSystem(): LocalDate = LocalDate.tomorrow(TimeZone.currentSystemDefault())

fun LocalDate.Companion.lastMondaySystem(): LocalDate = LocalDate.lastMonday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastTuesdaySystem(): LocalDate = LocalDate.lastTuesday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastWednesdaySystem(): LocalDate = LocalDate.lastWednesday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastThursdaySystem(): LocalDate = LocalDate.lastThursday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastFridaySystem(): LocalDate = LocalDate.lastFriday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastSaturdaySystem(): LocalDate = LocalDate.lastSaturday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.lastSundaySystem(): LocalDate = LocalDate.lastSunday(TimeZone.currentSystemDefault())

fun LocalDate.Companion.nextMondaySystem(): LocalDate = LocalDate.nextMonday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextTuesdaySystem(): LocalDate = LocalDate.nextTuesday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextWednesdaySystem(): LocalDate = LocalDate.nextWednesday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextThursdaySystem(): LocalDate = LocalDate.nextThursday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextFridaySystem(): LocalDate = LocalDate.nextFriday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextSaturdaySystem(): LocalDate = LocalDate.nextSaturday(TimeZone.currentSystemDefault())
fun LocalDate.Companion.nextSundaySystem(): LocalDate = LocalDate.nextSunday(TimeZone.currentSystemDefault())

fun LocalDate.Companion.firstDayOfTheYearSystem(): LocalDate = LocalDate(LocalDate.todaySystem().year, 1, 1)
fun LocalDate.Companion.lastDayOfTheYearSystem(): LocalDate = LocalDate(LocalDate.todaySystem().year, 12, 31)