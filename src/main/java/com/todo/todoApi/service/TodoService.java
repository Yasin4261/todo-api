package com.todo.todoApi.service;

import com.todo.todoApi.entity.Todo;
import com.todo.todoApi.entity.User;
import com.todo.todoApi.repository.TodoRepository;
import com.todo.todoApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository; // UserRepository eklendi

    public Todo addTodo(Long userId, String title, String description, boolean completed) {
        // Kullanıcıyı bulma
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        // Yeni bir Todo oluşturma
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setCompleted(completed);
        todo.setUser(user); // Todo nesnesine kullanıcıyı set etme

        // Todo'yu veritabanına kaydetme
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
        todoRepository.delete(todo);
    }

    public List<Todo> getTodosByUserId(Long userId) {
        return todoRepository.findByUserId(userId);
    }
}
