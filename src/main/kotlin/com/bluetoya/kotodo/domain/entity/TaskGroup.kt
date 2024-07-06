package com.bluetoya.kotodo.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TaskGroup(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var name: String
) {
    fun toEntity(): TaskGroup = TaskGroup(
        name = name,
    )
}
