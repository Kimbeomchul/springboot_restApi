package com.miaps.controller;

import com.miaps.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class MainController {
    @Autowired
    private MainService service;

    @GetMapping("/get")
    public void getAll(){
        service.getAll();
    }
}
