package com.bluetoya.kotodo.service

import com.bluetoya.kotodo.domain.TaskGroupDomainService
import com.bluetoya.kotodo.domain.entity.TaskGroup
import org.springframework.stereotype.Service

@Service
class TaskGroupService(private val taskGroupDomainService: TaskGroupDomainService) {
    fun getList(): Iterable<TaskGroup> {
        return taskGroupDomainService.getList()
    }

    fun getOne(id: Long): TaskGroup {
        return taskGroupDomainService.getOne(id)
    }

    fun create(): Any {
        return TODO("")
    }

    fun update(): Any {
        return TODO("")
    }

    fun delete(id: Long) {
        taskGroupDomainService.delete(id)
    }
}
