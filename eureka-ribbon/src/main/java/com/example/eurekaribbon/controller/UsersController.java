package com.example.eurekaribbon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("user")
public class UsersController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello")
    public String  demo(@RequestParam("name") String name){
        return restTemplate.getForObject("http://eureka-pro/user/hello?name="+name,String.class);

    }
}
