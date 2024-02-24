package localdate

import kotlinxdatetimefun.localdate.LocalDateUtil
import kotlinxdatetimefun.localdate.extensions.getDayDifference
import kotlinxdatetimefun.localdate.extensions.getHourDifference
import kotlinxdatetimefun.localdate.extensions.getMinuteDifference
import kotlinxdatetimefun.localdate.extensions.getMonthDifference
import kotlinxdatetimefun.localdate.extensions.getSecondDifference
import kotlinxdatetimefun.localdate.extensions.getYearDifference
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LocalDateComparisonExtensionsTest {

    @Test
    fun `given 2 dates 0 days apart, then should see such differences in comparing`() {
        // given
        // 2021-06-08
        val dateA = LocalDateUtil.new(
            year = 2021,
            month = 6,
            day = 8,
        )

        // 2021-06-08
        val dateB = LocalDateUtil.new(
            year = 2021,
            month = 6,
            day = 8,
        )

        // when
        val actualYearsDifference = dateA.getYearDifference(dateB)
        val actualMonthDifference = dateA.getMonthDifference(dateB)
        val actualDayDifference = dateA.getDayDifference(dateB)
        val actualHourDifference = dateA.getHourDifference(dateB)
        val actualMinuteDifference = dateA.getMinuteDifference(dateB)
        val actualSecondDifference = dateA.getSecondDifference(dateB)

        // then
        assertEquals(0, actualYearsDifference)
        assertEquals(0, actualMonthDifference)
        assertEquals(0, actualDayDifference)
        assertEquals(0, actualHourDifference)
        assertEquals(0, actualMinuteDifference)
        assertEquals(0, actualSecondDifference)
    }

    @Test
    fun `given 2 dateTimes 3 years apart, then should see such differences in comparing`() {
        // given
        // 2021-06-08 3:30 PM
        val dateA = LocalDateUtil.new(
            year = 2021,
            month = 6,
            day = 8,
        )

        // 2024-06-08 3:30 PM
        val dateB = LocalDateUtil.new(
            year = 2024,
            month = 6,
            day = 8,
        )

        // when
        val actualYearsDifference = dateA.getYearDifference(dateB)
        val actualMonthDifference = dateA.getMonthDifference(dateB)
        val actualDayDifference = dateA.getDayDifference(dateB)
        val actualHourDifference = dateA.getHourDifference(dateB)
        val actualMinuteDifference = dateA.getMinuteDifference(dateB)
        val actualSecondDifference = dateA.getSecondDifference(dateB)

        // then
        assertEquals(3, actualYearsDifference)
        assertEquals(36, actualMonthDifference)
        assertEquals(1096, actualDayDifference)
        assertEquals(26304, actualHourDifference)
        assertEquals(1578240, actualMinuteDifference)
        assertEquals(94694400, actualSecondDifference)
    }    
}