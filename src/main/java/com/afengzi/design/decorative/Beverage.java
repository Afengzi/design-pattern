package com.afengzi.design.decorative;

/**
 * Created by klov on 2015/11/2.
 * 抽象(基础)组件</br>
 * 装饰者和被装饰者的基类</br>
 * 饮料
 */
public abstract class Beverage {
    String description = "unknown beverage ";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
