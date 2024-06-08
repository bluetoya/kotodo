package com.bluetoya.kotodo.service

import com.bluetoya.kotodo.domain.TaskDomainService
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskDomainService: TaskDomainService
) {


    fun getList(): String {

        return "test";
    }

    fun getOne(id: Long): Any {

        return TODO("Provide the return value")
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
