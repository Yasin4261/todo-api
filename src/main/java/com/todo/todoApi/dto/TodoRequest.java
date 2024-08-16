package com.todo.todoApi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoRequest {
    private Long userId;
    private String title;
    private String description;
    private boolean completed;
}
