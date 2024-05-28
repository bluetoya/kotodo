package com.bluetoya.kotodo.service;

import com.bluetoya.kotodo.domain.ToDo;
import com.bluetoya.kotodo.domain.repo.ToDoRepository;
import com.bluetoya.kotodo.service.request.ToDoRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> getList() {
        return toDoRepository.findAll();
    }

    public ToDo getOne(Long id) {
        return this
                .getOptionalOne(id)
                .orElseThrow();
    }

    private Optional<ToDo> getOptionalOne(Long id) {
        return toDoRepository.getOne(id);
    }

    public Object create(ToDoRequest request) {
        return null;
    }

    public Object update() {
        return null;
    }

    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }
}
