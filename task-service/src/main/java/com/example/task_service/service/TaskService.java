package com.example.task_service.service;

import com.example.task_service.entity.Task;
import com.example.task_service.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository _repository;

    public Task getTaskById(Long id) {
        return _repository.findById(id).orElse(null);
    }
    public Task createTask(Task task) {
        return _repository.save(task);
    }
    public void deleteTask(Long id) {
        _repository.deleteById(id);
    }
    public Task updateTask(Task task) {
        return _repository.save(task);
    }
    public List<Task> getTasks() {
        return _repository.findAll();
    }
    public List<Task> getTasksByUserId(Long userId) {
        return _repository.findByUserId(userId);
    }
}
