package com.bluetoya.kotodo.service.records;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ToDoRecord(@NotNull String name, String toDoGroup, String description, boolean isDone, LocalDateTime dueDate) {}
