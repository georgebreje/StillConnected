package com.personalprojects.StillConnected;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Account {
    //used for log in / sign up
    @Id
    private String username;
    private String password;

    public Account(){}

    Account(String username, String password){
        this.username=username;
        this.password=password;
    }


    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    public void setUsername(){
        this.username=username;
    }
    public void setPassword(){
        this.password=password;
    }

    public String toString(){
        return "Account{" + "username= "+this.username + ", password= " + this.password + "}";
    }
}

