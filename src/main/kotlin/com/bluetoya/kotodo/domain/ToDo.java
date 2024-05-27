package com.bluetoya.kotodo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "to_do")
public class ToDo {
  @Id private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "to_do_group")
  private String toDoGroup;

  @Column(name = "description")
  private String description;

  @Column(name = "is_done")
  private boolean isDone;

  @Column(name = "due_date")
  private LocalDateTime dueDate;

  // https://www.baeldung.com/jpa-no-argument-constructor-entity-class
  // Hibernate가 Reflection을 통해 entity 클래스를 생성하는데, 아규먼트가 없는 생성자를 필요로 함
  // 또한 성능 최적화나 lazy loading을 위해 proxy 객체를 쓸 때도 NoArgs constructor가 필요
  public ToDo() {}

  public ToDo(
      Long id,
      String name,
      String toDoGroup,
      String description,
      boolean isDone,
      LocalDateTime dueDate) {
    this.id = id;
    this.name = name;
    this.toDoGroup = toDoGroup;
    this.description = description;
    this.isDone = isDone;
    this.dueDate = dueDate;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getToDoGroup() {
    return toDoGroup;
  }

  public String getDescription() {
    return description;
  }

  public boolean isDone() {
    return isDone;
  }

  public LocalDateTime getDueDate() {
    return dueDate;
  }
}
