package com.bluetoya.kotodo.controller

import com.bluetoya.kotodo.service.TaskItemService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/task/item")
class TaskItemController(private val taskItemService: TaskItemService) {

    @GetMapping
    fun getList(@RequestParam taskId: Long) = taskItemService.getList(taskId)
}
