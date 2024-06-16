package com.bluetoya.kotodo.service

import com.bluetoya.kotodo.domain.Task
import com.bluetoya.kotodo.domain.TaskDomainService
import com.bluetoya.kotodo.service.request.TaskCreateRequest
import com.bluetoya.kotodo.service.request.TaskRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
class TaskService(
    private val taskDomainService: TaskDomainService
) {

    @Transactional(readOnly = true)
    fun getList(dueDate: LocalDateTime): Iterable<Task> {
        return taskDomainService.getList(dueDate);
    }

    @Transactional(readOnly = true)
    fun getOne(id: Long): Any {

        return taskDomainService.getOne(id)
    }

    fun create(request: TaskCreateRequest): Long {

        return taskDomainService.createOne(request)
    }

    fun update(request: TaskRequest): Any {
        return taskDomainService.update(request)
    }

    fun delete(id: Long) {

        taskDomainService.delete(id)
    }
}
