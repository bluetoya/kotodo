package com.bluetoya.kotodo.domain

import com.bluetoya.kotodo.domain.entity.TaskItem
import com.bluetoya.kotodo.domain.repo.TaskItemRepository
import com.bluetoya.kotodo.service.request.TaskItemCreateRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskItemDomainService(val taskItemRepository: TaskItemRepository) {

    fun getList(): Iterable<TaskItem> {
        return taskItemRepository.findAll()
    }

    fun getOne(id: Long): TaskItem {
        return this.getOneOptional(id)
            .orElseThrow()
    }

    private fun getOneOptional(id: Long): Optional<TaskItem> {
        return taskItemRepository.findById(id);
    }

    fun delete(id: Long) {
        taskItemRepository.deleteById(id)
    }

    fun createOne(request: TaskItemCreateRequest):  {
        val taskItem = taskItemRepository.save(request.toEntity())
    }

    fun update(): Long {
        return TODO()
    }

}
