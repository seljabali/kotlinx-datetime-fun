package kotlinxdatetimefun.localdate

import kotlinx.datetime.*
import kotlinxdatetimefun.localdate.extensions.getLast
import kotlinxdatetimefun.localdate.extensions.getNext
import kotlinxdatetimefun.localdate.extensions.minusDays
import kotlinxdatetimefun.localdate.extensions.plusDays
import kotlinxdatetimefun.localdatetime.extensions.toLocalDate

fun LocalDate.Companion.todayUtc(): LocalDate = Clock.System.now().toLocalDateTime(TimeZone.UTC).toLocalDate()
fun LocalDate.Companion.yesterdayUtc(): LocalDate = todayUtc().minusDays(1)
fun LocalDate.Companion.tomorrowUtc(): LocalDate = todayUtc().plusDays(1)

fun LocalDate.Companion.lastMondayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.MONDAY)
fun LocalDate.Companion.lastTuesdayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.TUESDAY)
fun LocalDate.Companion.lastWednesdayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.lastThursdayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.THURSDAY)
fun LocalDate.Companion.lastFridayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.FRIDAY)
fun LocalDate.Companion.lastSaturdayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.SATURDAY)
fun LocalDate.Companion.lastSundayUtc(): LocalDate = todayUtc().getLast(DayOfWeek.SUNDAY)

fun LocalDate.Companion.nextMondayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.MONDAY)
fun LocalDate.Companion.nextTuesdayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.TUESDAY)
fun LocalDate.Companion.nextWednesdayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.nextThursdayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.THURSDAY)
fun LocalDate.Companion.nextFridayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.FRIDAY)
fun LocalDate.Companion.nextSaturdayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.SATURDAY)
fun LocalDate.Companion.nextSundayUtc(): LocalDate = todayUtc().getNext(DayOfWeek.SUNDAY)

fun LocalDate.Companion.firstDayOfTheYearUtc(): LocalDate = LocalDate(LocalDate.todayUtc().year, 1, 1)
fun LocalDate.Companion.lastDayOfTheYearUtc(): LocalDate = LocalDate(LocalDate.todayUtc().year, 12, 31)