package com.afengzi.design.decorative.component;

import com.afengzi.design.decorative.Beverage;

/**
 * Created by klov on 2015/11/2.
 * 具体组件</br>
 * 浓咖啡
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "coffee : Espresso ";
    }
}
