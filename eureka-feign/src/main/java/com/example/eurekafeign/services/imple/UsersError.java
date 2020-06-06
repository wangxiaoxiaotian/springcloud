package com.example.eurekafeign.services.imple;

import com.example.eurekafeign.services.UsersServices;
import org.springframework.stereotype.Component;

@Component
public class UsersError implements UsersServices {

    @Override
    public String demo(String name) {
        return "hello world 报错了"+name;
    }
}
