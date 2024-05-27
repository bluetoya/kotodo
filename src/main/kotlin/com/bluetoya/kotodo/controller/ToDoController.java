package com.bluetoya.kotodo.controller;

import com.bluetoya.kotodo.service.ToDoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public Object getList() {
        return toDoService.getList();
    }

    @GetMapping("/{id}")
    public Object getOne(@PathVariable Long id) {
        return toDoService.getOne(id);
    }

    @PostMapping
    public Object create() {
        return toDoService.create();
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable Long id) {
        return toDoService.update(id);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id) {
        return toDoService.delete(id);
    }
}
