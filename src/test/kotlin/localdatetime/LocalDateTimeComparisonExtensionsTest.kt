package localdatetime

import kotlinx.datetime.LocalDateTime
import kotlinxdatetimefun.localdatetime.extensions.getDayDifference
import kotlinxdatetimefun.localdatetime.extensions.getHourDifference
import kotlinxdatetimefun.localdatetime.extensions.getMinuteDifference
import kotlinxdatetimefun.localdatetime.extensions.getSecondDifference
import kotlinxdatetimefun.localdatetime.extensions.getYearDifference
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LocalDateTimeComparisonExtensionsTest {

    @Test
    fun `given 2 dateTimes 1hr and 10m apart, then should see such differences in comparing`() {
        // given
        // 2021-06-08 3:30 PM
        val dateA = LocalDateTime(
            year = 2021,
            monthNumber = 6,
            dayOfMonth = 8,
            hour = 15,
            minute = 30,
            second = 0,
            nanosecond = 0
        )

        // 2021-06-08 4:40 PM
        val dateB = LocalDateTime(
            year = 2021,
            monthNumber = 6,
            dayOfMonth = 8,
            hour = 16,
            minute = 40,
            second = 0,
            nanosecond = 0
        )

        // when
        val actualYearsDifference = dateA.getYearDifference(dateB)
        val actualDayDifference = dateA.getDayDifference(dateB)
        val actualHourDifference = dateA.getHourDifference(dateB)
        val actualMinuteDifference = dateA.getMinuteDifference(dateB)
        val actualSecondDifference = dateA.getSecondDifference(dateB)

        // then
        assertEquals(0, actualYearsDifference)
        assertEquals(0, actualDayDifference)
        assertEquals(1, actualHourDifference)
        assertEquals(70, actualMinuteDifference)
        assertEquals(4200, actualSecondDifference)
    }

    @Test
    fun `given 2 dateTimes 3 years apart, then should see such differences in comparing`() {
        // given
        // 2021-06-08 3:30 PM
        val dateA = LocalDateTime(
            year = 2021,
            monthNumber = 6,
            dayOfMonth = 8,
            hour = 15,
            minute = 30,
            second = 0,
            nanosecond = 0
        )

        // 2024-06-08 3:30 PM
        val dateB = LocalDateTime(
            year = 2024,
            monthNumber = 6,
            dayOfMonth = 8,
            hour = 15,
            minute = 30,
            second = 0,
            nanosecond = 0
        )

        // when
        val actualYearsDifference = dateA.getYearDifference(dateB)
        val actualDayDifference = dateA.getDayDifference(dateB)
        val actualHourDifference = dateA.getHourDifference(dateB)
        val actualMinuteDifference = dateA.getMinuteDifference(dateB)
        val actualSecondDifference = dateA.getSecondDifference(dateB)

        // then
        assertEquals(3, actualYearsDifference)
        assertEquals(1096, actualDayDifference)
        assertEquals(26304, actualHourDifference)
        assertEquals(1578240, actualMinuteDifference)
        assertEquals(94694400, actualSecondDifference)
    }
}