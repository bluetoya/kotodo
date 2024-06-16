package com.bluetoya.kotodo.controller

import com.bluetoya.kotodo.service.TaskService
import com.bluetoya.kotodo.service.request.TaskCreateRequest
import com.bluetoya.kotodo.service.request.TaskRequest
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/task")
class TaskController(private val taskService: TaskService) {

    @GetMapping("/list")
    fun getList(@RequestParam dueDate: LocalDateTime) = taskService.getList(dueDate)

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long) = taskService.getOne(id)

    @PostMapping
    fun create(@Valid request: TaskCreateRequest) = taskService.create(request)

    @PutMapping
    fun update(@Valid request: TaskRequest) = taskService.update(request)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = taskService.delete(id)

}
