package com.springazuredemo.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return " Webapplication  has ben deployed to azure !";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}
