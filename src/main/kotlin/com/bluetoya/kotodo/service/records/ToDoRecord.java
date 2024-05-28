package com.bluetoya.kotodo.service.records;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

// Java 17 record
// 불변 객체 생성, setter 생성하지 않음
// dto 클래스 대체
public record ToDoRecord(@NotNull String name, String toDoGroup, String description, boolean isDone, LocalDateTime dueDate) {}
