package kotlinxdatetimefun.localdatetime.extensions

import kotlinx.datetime.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

fun LocalDateTime.print(format: String, locale: Locale = Locale.US): String =
    this.format(DateTimeFormatterBuilder().appendPattern(format).toFormatter(locale))