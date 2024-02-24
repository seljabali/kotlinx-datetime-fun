package kotlinxdatetimefun.localtime.extensions

import kotlinx.datetime.LocalTime
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

fun LocalTime.print(format: String, locale: Locale = Locale.US): String =
    this.format(DateTimeFormatterBuilder().appendPattern(format).toFormatter(locale))