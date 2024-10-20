package com.example.task_service.controller;

import com.example.task_service.entity.Task;
import com.example.task_service.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
public class TaskController {
    @Autowired
    private TaskService _service;

    @GetMapping
    public List<Task> getTasks() {
        return _service.getTasks();
    }
    @GetMapping("/user/{userId}")
    public List<Task> getTasksByUserId(long userId) {
        return _service.getTasksByUserId(userId);
    }
    @GetMapping("/{id}")
    public Task getTaskById(long id) {
        return _service.getTaskById(id);
    }
    @PostMapping
    public Task createTask(Task task) {
        return _service.createTask(task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(long id) {
        _service.deleteTask(id);
    }
}
