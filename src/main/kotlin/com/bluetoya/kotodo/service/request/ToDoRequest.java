package com.bluetoya.kotodo.service.request;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.time.LocalDateTime;

public class ToDoRequest {

    private Long id;
    private String name;
    private String toDoGroup;
    private String description;
    private boolean isDone;
    private LocalDateTime dueDate;

}
