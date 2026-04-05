package com.example.webdemo.controller;

import com.example.webdemo.model.Name;
import com.example.webdemo.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    NameService service;

    @RequestMapping("/Name")
    public String getname(){
        return service.getName();
    }


}
