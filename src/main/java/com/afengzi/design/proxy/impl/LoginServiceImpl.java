package com.afengzi.design.proxy.impl;

import com.afengzi.design.proxy.LoginService;

/**
 * Created by klov on 2015/10/25.
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String userName, String password) {
        System.out.println(getClass().getName()+" print ...");
    }
}
