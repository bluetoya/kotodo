package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.domain.entity.TaskGroup
import com.bluetoya.kotodo.domain.repo.TaskGroupRepository
import com.bluetoya.kotodo.service.request.TaskCreateRequest
import com.bluetoya.kotodo.service.request.TaskRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskGroupDomainService(private val taskGroupRepository: TaskGroupRepository) {

    fun getList(): Iterable<TaskGroup> {
        return taskGroupRepository.findAll()
    }

    fun getOne(id: Long): TaskGroup {
        return this.getOneOptional(id)
            .orElseThrow()
    }

    private fun getOneOptional(id: Long): Optional<TaskGroup> {
        return taskGroupRepository.findById(id);
    }

    fun delete(id: Long) {
        taskGroupRepository.deleteById(id)
    }

    fun createOne(request: TaskCreateRequest): Long {
        val task = taskGroupRepository.save(request.toEntity())
        return task.id
    }

    fun update(request: TaskRequest): Long {
        val taskGroup = taskGroupRepository.findById(request.id).get()
        taskGroup.name = request.name
        return taskGroup.id
    }
}
