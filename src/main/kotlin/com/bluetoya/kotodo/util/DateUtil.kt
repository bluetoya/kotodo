package com.bluetoya.kotodo.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*

class DateUtil {

    fun LocalDateTime.format(): String = this.format(dateFormatter)

    private val dateFormatter = DateTimeFormatterBuilder()
        .appendPattern("yyyy-MM-dd")
        .appendLiteral(" ")
        .appendLiteral(" ")
        .appendPattern("yyyy")
        .toFormatter(Locale.KOREA)
}
