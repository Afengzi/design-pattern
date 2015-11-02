package com.afengzi.design.decorative.decorator;

import com.afengzi.design.decorative.Beverage;

/**
 * Created by klov on 2015/11/2.
 * 装饰者</br>
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage ;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" , mocha !";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
