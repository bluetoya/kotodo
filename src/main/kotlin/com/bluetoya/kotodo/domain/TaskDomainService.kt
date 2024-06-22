package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.domain.repo.TaskRepository
import com.bluetoya.kotodo.service.request.TaskCreateRequest
import com.bluetoya.kotodo.service.request.TaskRequest
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

    fun delete(id: Long) {
        taskRepository.deleteById(id)
    }

    fun createOne(request: TaskCreateRequest): Long {
        val task = taskRepository.save(request.toEntity())
        if (task.id != null) {
            return task.id!!
        }
        throw Exception("task not found")
    }

    fun update(request: TaskRequest): Long {
        val task = taskRepository.findById(request.id).get()
        task.name = request.name
        task.taskGroup = request.taskGroup
        task.description = request.description
        task.isDone = request.isDone
        task.dueDate = request.dueDate

        return task.id!!
    }
}
