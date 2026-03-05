package com.Raghavendraproject.TaskMange_springboot.dto;

import com.Raghavendraproject.TaskMange_springboot.entity.Task;
import com.Raghavendraproject.TaskMange_springboot.entity.TaskStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;

    public static TaskResponse fromEntity(Task task) {
        TaskResponse dto = new TaskResponse();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        return dto;
    }
}
