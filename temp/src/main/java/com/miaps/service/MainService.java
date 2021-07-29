package com.miaps.service;

import com.miaps.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private personRepository personrepo;

    public void getAll(){
        System.out.println("Service");
    }

}
