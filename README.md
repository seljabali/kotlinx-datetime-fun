<h3 align="center"><strong>Kotlinx DateTime extension functions.</strong></h3>
<p align="center">
  <a href="https://github.com/seljabali/kotlinx-datetime-fun/actions?query=branch%3Amain"><img alt="Build Status" src="https://github.com/seljabali/kotlinx-datetime-fun/actions/workflows/main.yml/badge.svg"/></a>
</p> <br>

```diff
- val localDateFormat = LocalDate.Format {
-     byUnicodePattern("dd/MM/yyyy")
- }
- val date = LocalDate.parse("11/15/2024", localDateFormat)
+ val date = "11/15/2024".toLocalDate("dd/MM/yyyy")

- val dateFormat = LocalDate.Format {
-     byUnicodePattern("dd/MM/yyyy")
- }
- print(dateFormat.format(date))
+ print(date.print("MM/dd/yyyy"))

- val result = date.plus(days * -1, DateTimeUnit.DAY)
+ val result = date.minusDays(days)
```

## What's In It?
#### 1. Parsing
```kotlin
// Provided time
val result = "01:30 AM".toLocalTime()

// Provided local date
val result = "2021-06-07".toLocalDate()

// Provided ambiguous date formats
val result = "06/07/2021".toLocalDateTime(format = "MM/dd/yyyy")
```
#### 2. Creation
```kotlin
val result = LocalDateTime.of(year = 2024, month = 12, dayOfMonth= 30)
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
val date = "2021-07-06".toLocalDate()
val result = date.print(format = "MM/dd/yyyy")
```

#### 5. Attributes
```kotlin
val result = date.isAtStartOfDay()
val result = date.getDaysInMonth()
```

#### 6. Mutations
```kotlin
val result = date.getLast(DayOfWeek.FRIDAY)
val result = date.getNext(DayOfWeek.MONDAY)
```

#### 7. Preset Dates
```kotlin
val result = LocalTime.now()
val result = LocalDateTime.yesterday()
val result = LocalDate.startOfYear()
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
