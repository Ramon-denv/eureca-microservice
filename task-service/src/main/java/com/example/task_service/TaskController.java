package com.example.task_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    private List<Task> task = new ArrayList<>();

    @GetMapping("/")
    public List<Task> getTask() {
        return task;
    }

    @GetMapping("/{id}")
    public Task getTasks(@PathVariable int id) {
        return Task.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/")
    public Task createUser(@RequestBody Task task) {
        Task.add(task);
        return task;
    }
}
