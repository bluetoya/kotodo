package com.bluetoya.kotodo.service.request

import com.bluetoya.kotodo.domain.entity.TaskGroup

data class TaskGroupCreateRequest(
    val name: String,
)  {
    fun toEntity(): TaskGroup = TaskGroup(
        name = name,
    )
}
