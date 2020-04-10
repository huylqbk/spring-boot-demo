package com.demo.controller;

import com.demo.exception.ExceptionNotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/error")
public class ErrorController {

    @GetMapping()
    public ResponseEntity<Object> getError() {
        throw new ExceptionNotFound();
    }
}
