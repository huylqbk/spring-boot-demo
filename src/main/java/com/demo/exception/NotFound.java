package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFound {
    @ExceptionHandler(value = ExceptionNotFound.class)
    public ResponseEntity<Object> exceptionNotFound(ExceptionNotFound exceptionNotFound) {
    return new ResponseEntity("not found", HttpStatus.NOT_FOUND);
    }
}
