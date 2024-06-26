package com.bluetoya.kotodo.domain.repo

import com.bluetoya.kotodo.domain.entity.TaskGroup
import org.springframework.data.repository.CrudRepository

interface TaskGroupRepository : CrudRepository<TaskGroup, Long> {
}
