package com.afengzi.design.static1.impl;

import com.afengzi.design.static1.LoginService;

/**
 * Created by klov on 2015/10/25.
 */
public class LoginServiceProxy implements LoginService {

    private LoginService loginService ;

    public LoginServiceProxy(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void login(String userName, String password) {
        loginService.login(userName,password);
    }
}
