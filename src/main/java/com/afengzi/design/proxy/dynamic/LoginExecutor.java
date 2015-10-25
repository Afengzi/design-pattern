package com.afengzi.design.proxy.dynamic;

import com.afengzi.design.proxy.LoginService;
import com.afengzi.design.proxy.impl.LoginServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by klov on 2015/10/25.
 */
public class LoginExecutor {

    public static void main(String[] args) {
        LoginExecutor executor = new LoginExecutor();
        LoginService loginService = executor.getLoginServiceProxy();
        loginService.login("klov", "123");
    }


    public LoginService getLoginServiceProxy() {
        LoginService loginServiceProxy = (LoginService) Proxy.newProxyInstance(
                LoginService.class.getClassLoader()
                , new Class[]{LoginService.class}
                , new LoginInvocationHandler());

        return loginServiceProxy;
    }

    public LoginService getLoginService(){
        return new LoginServiceImpl();
    }


    class LoginInvocationHandler implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("methodName : " + method.getName());
            return method.invoke(getLoginService(), args);
        }
    }

}
