package kotlinxdatetimefun.localdatetime.extensions

import kotlinxdatetimefun.localdate.extensions.toLocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern
import kotlinxdatetimefun.localtime.MIN

/**
 * Works off of String representations of date(time) and parses through the following attempts in order when
 * no format is present:
 * <p><ul>
 * <li>First, tries parsing as LocalDateTime, if successful, uses systemTimeZone.
 * <li>Lastly, tries parsing as LocalDate, if successful, adds start of daytime, & systemTimeZone.
 * </ul><p>
 * When a format is present, tries parsing using that format alone, & return null if it fails.
 *
 * @param this String representation of either LocalDate, or LocalDateTime.
 * @param format String representing format that should solely be used when parsing the date.
 * @return LocalDateTime? Null means couldn't parse, else parsed LocalDateTime.
 */
fun String.toLocalDateTime(format: String? = null): LocalDateTime? {
    val localDateTime = parseLocalDateTimeHelper(this, format)
    if (localDateTime != null) {
        return localDateTime
    }
    val localDate = this.toLocalDate(format)
    if (localDate != null) {
        return LocalDateTime(localDate, LocalTime.MIN)
    }
    return null
}

private fun parseLocalDateTimeHelper(dateText: String, format: String?): LocalDateTime? =
    if (format.isNullOrEmpty())
        try {
            LocalDateTime.parse(dateText)
        } catch (e: IllegalArgumentException) {
            null
        }
    else {
        try {
            @OptIn(FormatStringsInDatetimeFormats::class)
            val dateTimeFormat = LocalDateTime.Format {
                byUnicodePattern(format)
            }
            dateTimeFormat.parse(dateText)
        } catch (e: IllegalArgumentException) {
            null
        }
    }