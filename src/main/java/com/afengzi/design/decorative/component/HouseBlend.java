package com.afengzi.design.decorative.component;

import com.afengzi.design.decorative.Beverage;

/**
 * Created by klov on 2015/11/2.
 * 具体组件</br>
 *
 */
public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "coffee : houseblend ";
    }
}
