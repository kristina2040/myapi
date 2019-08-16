package com.api.RestApi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{
    @Id
    public int id;
    public String name;
    public String dec;
    public String email;

    public User() {
    }

    public User(int id, String name, String dec, String email) {
        this.id = id;
        this.name = name;
        this.dec = dec;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
