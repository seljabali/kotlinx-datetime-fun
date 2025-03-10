package kotlinxdatetimefun.localdate

import kotlinx.datetime.*
import kotlinxdatetimefun.localdate.extensions.getLast
import kotlinxdatetimefun.localdate.extensions.getNext
import kotlinxdatetimefun.localdate.extensions.minusDays
import kotlinxdatetimefun.localdate.extensions.plusDays
import kotlinxdatetimefun.localdatetime.extensions.toLocalDate

fun LocalDate.Companion.todaySystem(): LocalDate = Clock.System.now().toLocalDateTime(TimeZone.UTC).toLocalDate()
fun LocalDate.Companion.yesterdaySystem(): LocalDate = todaySystem().minusDays(1)
fun LocalDate.Companion.tomorrowSystem(): LocalDate = todaySystem().plusDays(1)

fun LocalDate.Companion.lastMondaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.MONDAY)
fun LocalDate.Companion.lastTuesdaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.TUESDAY)
fun LocalDate.Companion.lastWednesdaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.lastThursdaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.THURSDAY)
fun LocalDate.Companion.lastFridaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.FRIDAY)
fun LocalDate.Companion.lastSaturdaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.SATURDAY)
fun LocalDate.Companion.lastSundaySystem(): LocalDate = todaySystem().getLast(DayOfWeek.SUNDAY)

fun LocalDate.Companion.nextMondaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.MONDAY)
fun LocalDate.Companion.nextTuesdaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.TUESDAY)
fun LocalDate.Companion.nextWednesdaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.nextThursdaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.THURSDAY)
fun LocalDate.Companion.nextFridaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.FRIDAY)
fun LocalDate.Companion.nextSaturdaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.SATURDAY)
fun LocalDate.Companion.nextSundaySystem(): LocalDate = todaySystem().getNext(DayOfWeek.SUNDAY)

fun LocalDate.Companion.firstDayOfTheYearSystem(): LocalDate = LocalDate(LocalDate.todaySystem().year, 1, 1)
fun LocalDate.Companion.lastDayOfTheYearSystem(): LocalDate = LocalDate(LocalDate.todaySystem().year, 12, 31)