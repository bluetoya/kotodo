package com.bluetoya.kotodo.controller

import com.bluetoya.kotodo.service.TaskGroupService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/group")
class TaskGroupController(val taskGroupService: TaskGroupService) {

    @GetMapping
    fun getList() = taskGroupService.getList()

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long) = taskGroupService.getOne(id)

    @PostMapping
    fun create() = taskGroupService.create()

    @PutMapping("/{id}")
    fun update() = taskGroupService.update()

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = taskGroupService.delete(id)

}
