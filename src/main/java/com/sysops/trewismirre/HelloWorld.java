package com.sysops.trewismirre;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String helloworld() {
        return "Hello world";
    }
}
