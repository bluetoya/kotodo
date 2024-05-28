package com.bluetoya.kotodo.controller;

import com.bluetoya.kotodo.service.ToDoService;
import com.bluetoya.kotodo.service.records.ToDoRecord;
import jakarta.validation.Valid;
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
  public Object create(@Valid @RequestBody ToDoRecord request) {
    return toDoService.create(request);
  }

  @PutMapping
  public Object update() {
    return toDoService.update();
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    toDoService.delete(id);
  }
}
