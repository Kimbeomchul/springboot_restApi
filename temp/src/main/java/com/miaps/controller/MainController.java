package com.miaps.controller;

import com.miaps.entity.person;
import com.miaps.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class MainController {
    @Autowired
    private MainService service;


    // 현재 층을 나타냄 시작은 10
    public int status = 10;

    @PutMapping
    public person input(){
        person p = new person();
//        p.setName();
//        p.setD_point();
//        p.setS_point();
//        p.setUdYn();
//        p.setIoYn();
        return p;
    }

    @GetMapping
    public void getAll(){
        System.out.println("@@@@");
        service.getAll();
    }
}
