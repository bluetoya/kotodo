package com.bluetoya.kotodo.controller

import com.bluetoya.kotodo.service.TaskGroupService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/group")
class TaskGroupController(val taskGroupService: TaskGroupService) {

    @GetMapping
    fun getList() = taskGroupService.getList()

    @GetMapping("/{id}")
    fun getOne(@PathVariable id: Long) = taskGroupService.getOne(id)

}
