package com.bluetoya.kotodo.domain.repo

import com.bluetoya.kotodo.domain.entity.TaskItem
import org.springframework.data.repository.CrudRepository

interface TaskItemRepository: CrudRepository<TaskItem, Long> {
}
