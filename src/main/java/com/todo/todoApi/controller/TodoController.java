package com.todo.todoApi.controller;

import com.todo.todoApi.dto.TodoRequest;
import com.todo.todoApi.entity.Todo;
import com.todo.todoApi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/add")
    public ResponseEntity<Todo> addTodo(@RequestBody TodoRequest todoRequest) {
        Todo todo = todoService.addTodo(todoRequest.getUserId(), todoRequest.getTitle(), todoRequest.getDescription(), todoRequest.isCompleted());
        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{todoId}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long todoId) { // @RequestBody yerine @PathVariable
        try {
            todoService.deleteTodoById(todoId);
            return new ResponseEntity<>("Todo deleted successfully", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user/{userId}") // Parametre adı ile @PathVariable adı uyumlu olmalı
    public ResponseEntity<List<Todo>> getTodosByUserId(@PathVariable Long userId) {
        List<Todo> todos = todoService.getTodosByUserId(userId);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
}
