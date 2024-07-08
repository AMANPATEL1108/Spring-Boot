package com.practice.entities;

import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.lang.NonNull;

public class LoginData {


    @NotBlank(message="User Name can not be Empty")
    @Size(min=3,max=12,message="User name must be 3-12 Character")
    private String userName;

    @Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="invalid Email !!")
    private  String email;


    @AssertTrue(message="Must agree and Condition !!")
    private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
