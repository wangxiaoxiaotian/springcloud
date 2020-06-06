package com.example.eurekapro2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaPro2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaPro2Application.class, args);
    }

}
