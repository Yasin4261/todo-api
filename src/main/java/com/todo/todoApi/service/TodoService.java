package com.todo.todoApi.service;

import com.todo.todoApi.entity.Todo;
import com.todo.todoApi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id ) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Todo not found"));
        todoRepository.delete(todo);
    }

}
