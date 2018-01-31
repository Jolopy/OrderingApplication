package com.example.cczec.rutgersrestaurantautomation.Model;

/**
 * Created by cczec on 1/30/2018.
 */

public class User {
    /**
     * Created by cczec on 1/30/2018.
     */
    private String Name;
    private String Password;

    public User(String name, String password){
        Name = name;
        Password = password;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public String getPassword(){
        return Password;
    }
}

