package com.example.task_service.service;

import com.example.task_service.model.Task;
import com.example.task_service.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Create Task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Get All Tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get Task by ID
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    // Update Task
    public Task updateTask(Long id, Task updatedTask) {
        Task task = getTaskById(id);
        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setCompleted(updatedTask.isCompleted());
        return taskRepository.save(task);
    }

    // Delete Task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
