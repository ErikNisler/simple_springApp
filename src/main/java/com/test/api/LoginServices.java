package com.test.api;

import org.springframework.stereotype.Service;

@Service
public class LoginServices {

    public LoginForm setLogin(LoginForm loginForm){
        loginForm.setFirstName(loginForm.getFirstName());
        loginForm.setLastName(loginForm.getLastName());
        if (loginForm.getFirstName().isEmpty() || loginForm.getLastName().isEmpty()){
            throw new IllegalArgumentException("Check your login data");
        }
        return loginForm;
    }
}
