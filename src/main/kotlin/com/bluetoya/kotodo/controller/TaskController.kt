package com.bluetoya.kotodo.controller

import com.bluetoya.kotodo.service.TaskService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/task")
class TaskController(private val taskService: TaskService) {

    @GetMapping("/list")
    fun getList() = taskService.getList()

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long) = taskService.getOne(id)

    @PostMapping
    fun create() = taskService.create()

    @PutMapping
    fun update() = taskService.update()

    @DeleteMapping
    fun delete() = taskService.delete()

}
