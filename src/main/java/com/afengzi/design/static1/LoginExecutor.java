package com.afengzi.design.static1;

import com.afengzi.design.static1.impl.LoginServiceImpl;
import com.afengzi.design.static1.impl.LoginServiceProxy;

/**
 * Created by klov on 2015/10/25.
 */
public class LoginExecutor {


    public static void main(String[] args) {
        //real object ,be represented object
        LoginService loginService = new LoginServiceImpl();
        //proxy object
        LoginService loginServiceProxy = new LoginServiceProxy(loginService);
        loginServiceProxy.login("klov","1230");

    }
}
