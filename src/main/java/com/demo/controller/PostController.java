package com.demo.controller;

import com.demo.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public ResponseEntity<Object> postProduct(@RequestBody Product product) {
        return ResponseEntity.ok(product);
    }
}
