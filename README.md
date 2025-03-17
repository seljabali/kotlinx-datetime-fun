<h3 align="center"><strong>Kotlinx DateTime extension functions.</strong></h3>
<p align="center">
  <a href="https://github.com/seljabali/kotlinx-datetime-fun/actions?query=branch%3Amain"><img alt="Build Status" src="https://github.com/seljabali/kotlinx-datetime-fun/actions/workflows/main.yml/badge.svg"/></a> 
  <a href="https://repo1.maven.org/maven2/org/eljabali/sami/kotlinxdatetimefun/kotlinxdatetimefun/"><img alt="Maven Central" src="https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Forg%2Feljabali%2Fsami%2Fjavatimefun%2Fjavatimefun%2Fmaven-metadata.xml"/></a> 
  <a href="https://kotlinlang.org"><img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-2.1.10-orange.svg?style=flat&logo=kotlin"/></a>
</p> <br>

```diff
- val dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
- val date = LocalDate.parse(dateText, dateTimeFormatter)
+ val date = dateText.toLocalDate("yyyyMMdd")

- val dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
- print(dateFormatter.format(date))
+ print(date.print("MM/dd/yyyy"))

- if (ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now()) < 18) {
+ if (dateOfBirth.getYearDifference(LocalDates.today) < 18) {
```

## What's In It?
#### 1. Parsing
```kotlin
// Provided time
val result = "01:30 AM".toLocalTime()

// Provided local date
val result = "2021-06-07".toLocalDate()

// Provided ambiguous date formats
val result = "06/07/2021".toLocalDate(format = "MM/dd/yyyy")

// Automatic time zone conversions
val result = "2021-10-04T10:10:00+0000".toZonedDateTime()

// Maintain original time zone
val result = "2021-10-04T10:10:00+0000".toZonedDateTime(useSystemTimeZone = false)

// Parse LocalDate as ZonedDateTime
val result = "2021-06-07".toZonedDateTime()
```
#### 2. Creation
```kotlin
val result = ZonedDateTimeUtil.new(year = 2021, month = 3, day = 25)

val result = Date().toLocalDateTime()

val result = GregorianCalendar().toLocalDate()

val result = LocalTimeUtil.new(hour = 5, minute = 30)
```

#### 3. Comparisons
```kotlin
// Year
val result = dateA.compareYear(dateB)
val result = dateA.isBeforeYear(dateB)

// Month
val result = dateA.compareMonth(dateB)
val result = dateA.getMonthDifference(dateB)
val result = dateA.isEqualMonth(dateB)

// Day
val result = dateA.compareDay(dateB)
val result = dateA.getDayDifference(dateB)
val result = dateA.isAfterEqualDay(dateB)

// Time
val result = dateA.compareTime(dateB)
val result = dateA.getMinuteDifference(dateB)
val result = dateA.isAfterEqualTime(dateB)
```

#### 4. Print
```kotlin
val date = "2021-07-06".toZonedDateTime()
val result = date.print(format = "MM/dd/yyyy")
```

#### 5. Attributes
```kotlin
val result = date.isAtStartOfDay()

val result = date.getDaysInMonth()
```

#### 6. Mutations
```kotlin
val result = date.atStartOfDay()

val result = date.getLast(DayOfWeek.FRIDAY)

val result = date.getNext(DayOfWeek.MONDAY)
```

#### 7. Preset Dates
```kotlin
val result = ZonedDateTimes.today

val result = LocalDateTimes.tomorrow

val result = LocalDates.nextMonday
```

## Install
Add to module `build.gradle`:
```gradle
repositories {
  mavenCentral()
}

dependencies {
  implementation("org.eljabali.sami.kotlinxdatetimefun:kotlinxdatetimefun:0.0.1")
}  
```

</details>

## Find this library useful? 😏
Star this repository __[as others have](https://github.com/seljabali/kotlinx-datetime-fun/stargazers)__. ⭐️ <br>
