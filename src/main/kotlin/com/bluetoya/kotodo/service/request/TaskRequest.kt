package com.bluetoya.kotodo.service.request

import com.bluetoya.kotodo.domain.Task
import java.time.LocalDateTime

data class TaskRequest(
    val id: Long,
    val name: String,
    val taskGroup: String? = null,
    val description: String? = null,
    val isDone: Boolean,
    val dueDate: LocalDateTime
) {
    fun toEntity(): Task = Task(
        id = id,
        name = name,
        taskGroup = taskGroup,
        description = description,
        isDone = isDone,
        dueDate = dueDate
    )
}
