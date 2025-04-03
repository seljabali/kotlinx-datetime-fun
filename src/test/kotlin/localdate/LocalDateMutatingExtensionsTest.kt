package localdate

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinxdatetimefun.localdate.extensions.atEndOfDay
import kotlinxdatetimefun.localdate.extensions.atStartOfDay
import kotlinxdatetimefun.localdate.extensions.getLast
import kotlinxdatetimefun.localdate.extensions.getNext
import kotlinxdatetimefun.localdate.extensions.minusDays
import kotlinxdatetimefun.localdate.extensions.plusDays
import kotlinxdatetimefun.localtime.MAX
import kotlinxdatetimefun.localtime.MIN
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LocalDateMutatingExtensionsTest {

    @Test
    fun `minusDays subtracts the correct number of days`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when
        val result = date.minusDays(10)
        // then: 2021-09-15 minus 10 days is 2021-09-05
        assertEquals(LocalDate(2021, 9, 5), result)
    }

    @Test
    fun `plusDays adds the correct number of days`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when
        val result = date.plusDays(10)
        // then: 2021-09-15 plus 10 days is 2021-09-25
        assertEquals(LocalDate(2021, 9, 25), result)
    }

    @Test
    fun `getLast returns the same day when countingInThisDay is true and current day matches target`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: counting in the current day, if the target day is Wednesday, we get the same date.
        val lastWednesday = date.getLast(DayOfWeek.WEDNESDAY, countingInThisDay = true)
        // then
        assertEquals(date, lastWednesday)
    }

    @Test
    fun `getLast returns the previous occurrence when countingInThisDay is false and current day matches target`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: not counting the current day, even though it's Wednesday, should get previous Wednesday.
        val lastWednesday = date.getLast(DayOfWeek.WEDNESDAY, countingInThisDay = false)
        // then: previous Wednesday is 7 days before 2021-09-15 → 2021-09-08
        assertEquals(LocalDate(2021, 9, 8), lastWednesday)
    }

    @Test
    fun `getLast returns the most recent occurrence for a different target day`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: Looking for last Monday.
        val lastMonday = date.getLast(DayOfWeek.MONDAY)
        // then: The Monday before Wednesday 2021-09-15 is 2021-09-13.
        assertEquals(LocalDate(2021, 9, 13), lastMonday)
    }

    @Test
    fun `getNext returns the same day when countingInThisDay is true and current day matches target`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: counting in this day for Wednesday should return same date.
        val nextWednesday = date.getNext(DayOfWeek.WEDNESDAY, countingInThisDay = true)
        // then
        assertEquals(date, nextWednesday)
    }

    @Test
    fun `getNext returns the next occurrence when countingInThisDay is false and current day matches target`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: not counting the current day; even though it's Wednesday, should return the next Wednesday.
        val nextWednesday = date.getNext(DayOfWeek.WEDNESDAY, countingInThisDay = false)
        // then: next Wednesday is 7 days after 2021-09-15 → 2021-09-22
        assertEquals(LocalDate(2021, 9, 22), nextWednesday)
    }

    @Test
    fun `getNext returns the next occurrence for a different target day`() {
        // given
        val date = LocalDate(2021, 9, 15)  // Wednesday
        // when: Looking for next Friday.
        val nextFriday = date.getNext(DayOfWeek.FRIDAY)
        // then: The Friday following 2021-09-15 (Wednesday) is 2021-09-17.
        assertEquals(LocalDate(2021, 9, 17), nextFriday)
    }

    @Test
    fun `atStartOfDay returns LocalDateTime with time MIN`() {
        // given
        val date = LocalDate(2021, 9, 15)
        // when
        val startOfDay = date.atStartOfDay()
        // then: It should combine the date with LocalTime.MIN.
        assertEquals(LocalDateTime(date, LocalTime.MIN), startOfDay)
    }

    @Test
    fun `atEndOfDay returns LocalDateTime with time MAX`() {
        // given
        val date = LocalDate(2021, 9, 15)
        // when
        val endOfDay = date.atEndOfDay()
        // then: It should combine the date with LocalTime.MAX.
        assertEquals(LocalDateTime(date, LocalTime.MAX), endOfDay)
    }
}