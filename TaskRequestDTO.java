package com.Raghavendraproject.TaskMange_springboot.dto;

import com.Raghavendraproject.TaskMange_springboot.entity.TaskStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequestDTO {
    private String title;
    private String description;
    private TaskStatus status;
}
