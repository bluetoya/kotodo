package com.bluetoya.kotodo.service;

import com.bluetoya.kotodo.domain.repo.ToDoRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Object getList() {
        return toDoRepository.findAll();
    }

    public Object getOne(Long id) {
        return null;
    }

    public Object create() {
        return null;
    }

    public Object update(Long id) {
        return null;
    }

    public Object delete(Long id) {
        return null;
    }
}
