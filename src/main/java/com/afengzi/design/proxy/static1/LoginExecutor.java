package com.afengzi.design.proxy.static1;

import com.afengzi.design.proxy.LoginService;
import com.afengzi.design.proxy.impl.LoginServiceImpl;

/**
 * Created by klov on 2015/10/25.
 * 代理对象与被代理对象实现同一个接口,是同一类型</br>
 * LoginServiceProxy 控制|管理对LoginServiceImpl对象的访问
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
