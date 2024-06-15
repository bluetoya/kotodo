package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.service.request.TaskCreateRequest
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Task(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val taskGroup: String,
    val description: String,
    val isDone: Boolean,
    val dueDate: LocalDateTime
)

fun TaskCreateRequest.toEntity() = Task(
    name = this.name,
    taskGroup = this.taskGroup.orEmpty(),
    description = this.description.orEmpty(),
    isDone = false,
    dueDate = this.dueDateTime
)


