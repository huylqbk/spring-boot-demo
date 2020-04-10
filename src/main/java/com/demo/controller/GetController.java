package com.demo.controller;

import com.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/get")
public class GetController {

    @RequestMapping(value = "/value/{id}")
    public ResponseEntity<Object> getVariable(
            @PathVariable(value = "id") String id
    ) {
        return ResponseEntity.ok(id);
    }

    @RequestMapping(value = "/param")
    public ResponseEntity<Object> getParam(
            @RequestParam(value = "name",required = true) String name
    ) {
        return ResponseEntity.ok(name);
    }


    @RequestMapping(value = "/product")
    public ResponseEntity<Object> getProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("lemon");
        product.setPrice(10.0f);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
