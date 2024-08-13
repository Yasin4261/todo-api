package com.todo.todoApi.controller;

import com.todo.todoApi.entity.Todo;
import com.todo.todoApi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/add")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo savedTodo = todoService.addTodo(todo);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

}
