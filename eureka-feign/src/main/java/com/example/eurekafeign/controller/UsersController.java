package com.example.eurekafeign.controller;


import com.example.eurekafeign.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    @RequestMapping("hello")
    public String demo(@RequestParam("name") String name){
        String demo = usersServices.demo(name);
        return demo;
    }
}
