package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.domain.repo.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskDomainService(private val taskRepository: TaskRepository) {
    fun getList(): Iterable<Task> {
        return taskRepository.findAllByDueDate()
    }
}
