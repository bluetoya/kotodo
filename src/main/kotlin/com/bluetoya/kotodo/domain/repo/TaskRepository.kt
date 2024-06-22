package com.bluetoya.kotodo.domain.repo

import com.bluetoya.kotodo.domain.Task
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface TaskRepository : CrudRepository<Task, Long> {
    fun findAllByDueDate(dueDate: LocalDateTime): List<Task>

}
