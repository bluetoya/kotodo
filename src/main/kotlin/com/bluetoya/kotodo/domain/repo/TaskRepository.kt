package com.bluetoya.kotodo.domain.repo

import com.bluetoya.kotodo.domain.Task
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

interface TaskRepository : CrudRepository<Task, Long> {
    fun findAllByDueDate(): Iterable<Task>
}
