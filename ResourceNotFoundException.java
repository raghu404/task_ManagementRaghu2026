package com.Raghavendraproject.TaskMange_springboot.Exception;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}


