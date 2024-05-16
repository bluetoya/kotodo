package com.bluetoya.kotodo.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Task(
    @Id @GeneratedValue var id: Long,
    var name: String,
    var taskGroup: String,
    var description: String,
    var isDone: Boolean,
    var dueDate: LocalDateTime
)


