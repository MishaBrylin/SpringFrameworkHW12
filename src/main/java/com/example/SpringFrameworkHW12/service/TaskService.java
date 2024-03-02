package com.example.SpringFrameworkHW12.service;

import com.example.SpringFrameworkHW12.domain.Task;
import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    void addTask(Task task);
}
