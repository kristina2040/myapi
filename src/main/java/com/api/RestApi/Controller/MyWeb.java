package com.api.RestApi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWeb {

    @GetMapping("/mysite")
    public String m1(){
        return "index";
    }
}
