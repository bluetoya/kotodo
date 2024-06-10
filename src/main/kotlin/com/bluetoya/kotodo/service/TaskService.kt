package com.bluetoya.kotodo.service

import com.bluetoya.kotodo.domain.Task
import com.bluetoya.kotodo.domain.TaskDomainService
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

    fun create(): Any {

        return TODO("Provide the return value")
    }

    fun update(): Any {

        return TODO("Provide the return value")
    }

    fun delete(id: Long): Any {

        return TODO("Provide the return value")
    }
}
