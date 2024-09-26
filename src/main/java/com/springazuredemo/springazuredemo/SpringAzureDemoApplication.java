package com.springazuredemo.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return " Web application  has ben deployed to azure successfully  !";
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringAzureDemoApplication.class, args);
    }

}




