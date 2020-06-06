package com.example.eurekapro.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UsersController {

    @RequestMapping("hello")
    public String demo(@RequestParam("name")String name){
        return "hello world 001"+ name;
    }
}
