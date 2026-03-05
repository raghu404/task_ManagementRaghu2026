package com.Raghavendraproject.TaskMange_springboot.Service;

import com.Raghavendraproject.TaskMange_springboot.dto.TaskRequestDTO;
import com.Raghavendraproject.TaskMange_springboot.dto.TaskResponse;

import java.util.List;

public interface TaskService {
    TaskResponse createTask(TaskRequestDTO requestDTO);
    TaskResponse getTaskById(Long id);
    List<TaskResponse> getAllTasks();
    TaskResponse updateTask(Long id, TaskRequestDTO requestDTO);
    void deleteTask(Long id);
}
