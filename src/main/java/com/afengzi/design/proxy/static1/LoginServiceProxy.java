package com.afengzi.design.proxy.static1;

import com.afengzi.design.proxy.LoginService;

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
