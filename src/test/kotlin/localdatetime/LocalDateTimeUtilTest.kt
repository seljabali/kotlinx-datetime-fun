package localdatetime

import kotlinx.datetime.Instant
import kotlinx.datetime.toLocalDateTime
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LocalDateTimeUtilTest {

    @Test
    fun `given date epoch millisecond, when converted to localDateTime, then should match attributes`() {
        // given
        val epoch = 1325134800000

        // when
        val localDateTime = Instant.fromEpochMilliseconds(epoch).toLocalDateTime(kotlinx.datetime.TimeZone.UTC)

        // then
        assertEquals(2011, localDateTime.year)
        assertEquals(12, localDateTime.monthNumber)
        assertEquals(29, localDateTime.dayOfMonth)
        assertEquals(5, localDateTime.hour)
        assertEquals(0, localDateTime.minute)
        assertEquals(0, localDateTime.second)
    }

    @Test
    fun `given date epoch millisecond of Date, when converted to localDateTime, then should match attributes`() {
        // given
        val epoch = 1325134800000

        // when
        val localDateTime = Instant.fromEpochMilliseconds(epoch).toLocalDateTime(kotlinx.datetime.TimeZone.UTC)

        // then
        assertEquals(2011, localDateTime.year)
        assertEquals(12, localDateTime.monthNumber)
        assertEquals(29, localDateTime.dayOfMonth)
        assertEquals(5, localDateTime.hour)
        assertEquals(0, localDateTime.minute)
        assertEquals(0, localDateTime.second)
    }

    @Test
    fun `given date epoch millisecond of Date & UTC timezone, when converted to localDateTime, then should match attributes`() {
        // given
        val epoch = 1325134800000

        // when
        val localDateTime = Instant.fromEpochMilliseconds(epoch).toLocalDateTime(kotlinx.datetime.TimeZone.UTC)

        // then
        assertEquals(2011, localDateTime.year)
        assertEquals(12, localDateTime.monthNumber)
        assertEquals(29, localDateTime.dayOfMonth)
        assertEquals(5, localDateTime.hour)
        assertEquals(0, localDateTime.minute)
        assertEquals(0, localDateTime.second)
    }
}