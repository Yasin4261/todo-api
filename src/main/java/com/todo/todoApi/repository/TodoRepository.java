package com.todo.todoApi.repository;

import com.todo.todoApi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
