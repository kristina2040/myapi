package com.api.RestApi.service;

import com.api.RestApi.Model.User;
import com.api.RestApi.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo ur;

    public Iterable<User> getalldata(){
        return ur.findAll();
    }

    public String addUser(User x){
        ur.save(x);
        return "Data Saved";
    }
}
