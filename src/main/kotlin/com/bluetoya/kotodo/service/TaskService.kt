package com.bluetoya.kotodo.service

import com.bluetoya.kotodo.domain.Task
import com.bluetoya.kotodo.domain.TaskDomainService
import com.bluetoya.kotodo.service.request.TaskCreateRequest
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TaskService(
    private val taskDomainService: TaskDomainService
) {

    fun getList(dueDate: LocalDateTime): Iterable<Task> {
        return taskDomainService.getList(dueDate);
    }

    fun getOne(id: Long): Any {

        return taskDomainService.getOne(id)
    }

    fun create(request: TaskCreateRequest): Long {

        return taskDomainService.createOne(request)
    }

    fun update(): Any {

        return TODO("Provide the return value")
    }

    fun delete(id: Long) {

        taskDomainService.delete(id)
    }
}
