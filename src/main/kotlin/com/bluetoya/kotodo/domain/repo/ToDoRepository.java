package com.bluetoya.kotodo.domain.repo;

import com.bluetoya.kotodo.domain.ToDo;
import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    @NotNull
    List<ToDo> findAll();

    Optional<ToDo> getOne(Long id);
}
