package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceIml implements IService {
    @Override
    public void showService() {
        System.out.println("show Service");
    }
}
