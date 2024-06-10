package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.domain.repo.TaskRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class TaskDomainService(private val taskRepository: TaskRepository) {
    fun getList(dueDate: LocalDateTime): Iterable<Task> {
        return taskRepository.findAllByDueDate(dueDate)
    }

    fun getOne(id: Long): Task {
        return this.getOneOptional(id)
            .orElseThrow()
    }

    private fun getOneOptional(id: Long): Optional<Task> {
        return taskRepository.findById(id);
    }
}
