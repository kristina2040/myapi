package com.api.RestApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @GetMapping("/home")
    public String m1(){
        return "Hello Home";
    }
    @PostMapping("/home")
    public String m2(){
        return "Hello about";
    }
    @GetMapping("/cont")
    public String m3(){
        return "Hello cont";
    }
}