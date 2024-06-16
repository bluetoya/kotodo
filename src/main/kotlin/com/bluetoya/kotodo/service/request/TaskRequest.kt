package com.bluetoya.kotodo.service.request

import java.time.LocalDateTime

data class TaskRequest(
    val id: Long,
    val name: String,
    val taskGroup: String? = null,
    val description: String? = null,
    val dueDateTime: LocalDateTime
)
