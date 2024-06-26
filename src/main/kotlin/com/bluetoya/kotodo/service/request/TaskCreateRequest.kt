package com.bluetoya.kotodo.service.request

import com.bluetoya.kotodo.domain.entity.Task
import java.time.LocalDateTime

data class TaskCreateRequest(
    val name: String,
    val taskGroup: String? = null,
    val description: String? = null,
    val dueDate: LocalDateTime,
    ) {
    fun toEntity(): Task = Task(
        name = name,
        taskGroup = taskGroup,
        description = description,
        isDone = false,
        dueDate = dueDate
    )
}


