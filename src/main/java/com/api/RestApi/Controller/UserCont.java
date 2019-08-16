package com.api.RestApi.Controller;

import com.api.RestApi.Model.User;
import com.api.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCont {

    @Autowired
    private UserService us;

    @GetMapping("/getall")
    public Iterable<User> m1(){
        return us.getalldata();
    }

    @PostMapping("/add")
    public String m2(@RequestBody User u){
        return us.addUser(u);
    }
}
