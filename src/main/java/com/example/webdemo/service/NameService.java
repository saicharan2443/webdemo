package com.example.webdemo.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    String name="saicharan";

    public String getName(){
        return name;
    }
}
