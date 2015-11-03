package com.afengzi.design.adapter.adaptee.impl;

import com.afengzi.design.adapter.adaptee.Duck;
import com.afengzi.design.util.LogHelper;

/**
 * Created by klov on 2015/11/3.
 * 已存在的无法改变的接口实现类
 */
public class MallarDuck implements Duck {
    @Override
    public void quack() {
        LogHelper.printInfo("quack ...");
    }

    @Override
    public void fly() {
        LogHelper.printInfo("I am flying ...");
    }
}
