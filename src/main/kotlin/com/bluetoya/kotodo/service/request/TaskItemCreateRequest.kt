package com.bluetoya.kotodo.service.request

import com.bluetoya.kotodo.domain.entity.TaskItem

data class TaskItemCreateRequest(
    val name: String,
) {
    fun toEntity(): TaskItem = TaskItem(
        name = name,
    )
}
