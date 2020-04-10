package com.demo;

import com.demo.service.ServiceIml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBoot {
    Logger logger = LoggerFactory.getLogger(DemoSpringBoot.class);

    @Value("${app.demo.name:test}")
    private String name;

    @Autowired
    ServiceIml service;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBoot.class,args);
    }

    @RequestMapping(value = "/")
    public String hello(){
        logger.info("application running");
        service.showService();
        return "hello "+name;
    }
}
