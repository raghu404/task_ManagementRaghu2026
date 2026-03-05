package com.Raghavendraproject.TaskMange_springboot.Controller;



import com.Raghavendraproject.TaskMange_springboot.dto.TaskRequestDTO;
import com.Raghavendraproject.TaskMange_springboot.dto.TaskResponse;
import com.Raghavendraproject.TaskMange_springboot.Service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskResponse> createTask(@RequestBody TaskRequestDTO requestDTO) {
        return ResponseEntity.ok(taskService.createTask(requestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> getTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping
    public ResponseEntity<List<TaskResponse>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponse> updateTask(@PathVariable Long id, @RequestBody TaskRequestDTO requestDTO) {
        return ResponseEntity.ok(taskService.updateTask(id, requestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
