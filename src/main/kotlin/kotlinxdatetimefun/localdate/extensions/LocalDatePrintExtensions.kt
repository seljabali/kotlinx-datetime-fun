package kotlinxdatetimefun.localdate.extensions

import kotlinx.datetime.LocalDate
import java.time.format.DateTimeFormatterBuilder
import java.util.Locale

fun LocalDate.print(format: String, locale: Locale = Locale.US): String =
    this.format(DateTimeFormatterBuilder().appendPattern(format).toFormatter(locale))