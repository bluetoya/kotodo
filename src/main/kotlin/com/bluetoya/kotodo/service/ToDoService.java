package com.bluetoya.kotodo.service;

import com.bluetoya.kotodo.domain.ToDo;
import com.bluetoya.kotodo.domain.repo.ToDoRepository;
import com.bluetoya.kotodo.service.records.ToDoRecord;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  private final ToDoRepository toDoRepository;

  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public List<ToDo> getList() {
    return toDoRepository.findAll();
  }

  // null 체크와 null 상황 관리를 위해 Optional 사용
  // java 10부터 orElseThrow()는 자동으로 NoSuchElementException 발생
  public ToDo getOne(Long id) {
    return this.getOptionalOne(id).orElseThrow();
  }

  private Optional<ToDo> getOptionalOne(Long id) {
    return toDoRepository.getOne(id);
  }

  public ToDo create(ToDoRecord request) {
    return toDoRepository.save(new ToDo(request));
  }

  public Object update() {
    return null;
  }

  public void delete(Long id) {
    toDoRepository.deleteById(id);
  }
}
