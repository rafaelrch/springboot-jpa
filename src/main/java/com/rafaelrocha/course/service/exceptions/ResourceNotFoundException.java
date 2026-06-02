package com.rafaelrocha.course.service.exceptions;

import java.time.Instant;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
