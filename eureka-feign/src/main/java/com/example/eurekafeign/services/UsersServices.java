package com.example.eurekafeign.services;


import com.example.eurekafeign.services.imple.UsersError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-pro",fallback = UsersError.class)
public interface UsersServices {

    @RequestMapping("user/hello")
    public String demo(@RequestParam("name")String name);

}
