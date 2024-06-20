package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.service.request.TaskCreateRequest
import com.bluetoya.kotodo.service.request.TaskRequest
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Task(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    var taskGroup: String,
    var description: String,
    var isDone: Boolean,
    var dueDate: LocalDateTime
)

fun toEntity(): Task = Task(
    name = name,
    taskGroup = taskGroup.orEmpty(),
    description = description.orEmpty(),
    isDone = false,
    dueDate = dueDateTime
)



