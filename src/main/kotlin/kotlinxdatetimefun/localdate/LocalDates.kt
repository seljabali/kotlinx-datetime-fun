package kotlinxdatetimefun.localdate

import kotlinx.datetime.*
import kotlinxdatetimefun.localdate.extensions.getLast
import kotlinxdatetimefun.localdate.extensions.getNext
import kotlinxdatetimefun.localdate.extensions.minusDays
import kotlinxdatetimefun.localdate.extensions.plusDays
import kotlinxdatetimefun.localdatetime.extensions.toLocalDate

fun LocalDate.Companion.today(timeZone: TimeZone): LocalDate = Clock.System.now().toLocalDateTime(timeZone).toLocalDate()
fun LocalDate.Companion.yesterday(timeZone: TimeZone): LocalDate = today(timeZone).minusDays(1)
fun LocalDate.Companion.tomorrow(timeZone: TimeZone): LocalDate = today(timeZone).plusDays(1)

fun LocalDate.Companion.lastMonday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.MONDAY)
fun LocalDate.Companion.lastTuesday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.TUESDAY)
fun LocalDate.Companion.lastWednesday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.lastThursday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.THURSDAY)
fun LocalDate.Companion.lastFriday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.FRIDAY)
fun LocalDate.Companion.lastSaturday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.SATURDAY)
fun LocalDate.Companion.lastSunday(timeZone: TimeZone): LocalDate = today(timeZone).getLast(DayOfWeek.SUNDAY)

fun LocalDate.Companion.nextMonday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.MONDAY)
fun LocalDate.Companion.nextTuesday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.TUESDAY)
fun LocalDate.Companion.nextWednesday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.WEDNESDAY)
fun LocalDate.Companion.nextThursday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.THURSDAY)
fun LocalDate.Companion.nextFriday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.FRIDAY)
fun LocalDate.Companion.nextSaturday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.SATURDAY)
fun LocalDate.Companion.nextSunday(timeZone: TimeZone): LocalDate = today(timeZone).getNext(DayOfWeek.SUNDAY)

fun LocalDate.Companion.firstDayOfTheYear(timeZone: TimeZone): LocalDate = LocalDate(LocalDate.today(timeZone).year, 1, 1)
fun LocalDate.Companion.lastDayOfTheYear(timeZone: TimeZone): LocalDate = LocalDate(LocalDate.today(timeZone).year, 12, 31)