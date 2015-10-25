package com.afengzi.design.static1.impl;

import com.afengzi.design.static1.LoginService;

/**
 * Created by klov on 2015/10/25.
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String userName, String password) {
        System.out.println(getClass().getName()+" print ...");
    }
}
