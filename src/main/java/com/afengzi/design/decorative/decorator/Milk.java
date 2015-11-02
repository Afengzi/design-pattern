package com.afengzi.design.decorative.decorator;

import com.afengzi.design.decorative.Beverage;

/**
 * Created by klov on 2015/11/2.
 * 装饰者</br>
 * 牛奶
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage ;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , milk ";
    }

    @Override
    public double cost() {
        return beverage.cost()+1.1;
    }
}
