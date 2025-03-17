package kotlinxdatetimefun.localdate

import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone

fun LocalDate.Companion.nowUtc(): LocalDate = LocalDate.now(TimeZone.UTC)
fun LocalDate.Companion.todayUtc(): LocalDate = LocalDate.today(TimeZone.UTC)
fun LocalDate.Companion.yesterdayUtc(): LocalDate = LocalDate.yesterday(TimeZone.UTC)
fun LocalDate.Companion.tomorrowUtc(): LocalDate = LocalDate.tomorrow(TimeZone.UTC)

fun LocalDate.Companion.lastMondayUtc(): LocalDate = LocalDate.lastMonday(TimeZone.UTC)
fun LocalDate.Companion.lastTuesdayUtc(): LocalDate = LocalDate.lastTuesday(TimeZone.UTC)
fun LocalDate.Companion.lastWednesdayUtc(): LocalDate = LocalDate.lastWednesday(TimeZone.UTC)
fun LocalDate.Companion.lastThursdayUtc(): LocalDate = LocalDate.lastThursday(TimeZone.UTC)
fun LocalDate.Companion.lastFridayUtc(): LocalDate = LocalDate.lastFriday(TimeZone.UTC)
fun LocalDate.Companion.lastSaturdayUtc(): LocalDate = LocalDate.lastSaturday(TimeZone.UTC)
fun LocalDate.Companion.lastSundayUtc(): LocalDate = LocalDate.lastSunday(TimeZone.UTC)

fun LocalDate.Companion.nextMondayUtc(): LocalDate = LocalDate.nextMonday(TimeZone.UTC)
fun LocalDate.Companion.nextTuesdayUtc(): LocalDate = LocalDate.nextTuesday(TimeZone.UTC)
fun LocalDate.Companion.nextWednesdayUtc(): LocalDate = LocalDate.nextWednesday(TimeZone.UTC)
fun LocalDate.Companion.nextThursdayUtc(): LocalDate = LocalDate.nextThursday(TimeZone.UTC)
fun LocalDate.Companion.nextFridayUtc(): LocalDate = LocalDate.nextFriday(TimeZone.UTC)
fun LocalDate.Companion.nextSaturdayUtc(): LocalDate = LocalDate.nextSaturday(TimeZone.UTC)
fun LocalDate.Companion.nextSundayUtc(): LocalDate = LocalDate.nextSunday(TimeZone.UTC)

fun LocalDate.Companion.firstDayOfTheYearUtc(): LocalDate = LocalDate(LocalDate.todayUtc().year, 1, 1)
fun LocalDate.Companion.lastDayOfTheYearUtc(): LocalDate = LocalDate(LocalDate.todayUtc().year, 12, 31)