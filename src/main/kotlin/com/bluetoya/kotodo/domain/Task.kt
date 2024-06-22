package com.bluetoya.kotodo.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Task(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    var name: String,
    var taskGroup: String? = null,
    var description: String? = null,
    var isDone: Boolean,
    var dueDate: LocalDateTime
)



