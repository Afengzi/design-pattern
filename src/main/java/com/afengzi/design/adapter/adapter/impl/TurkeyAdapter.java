package com.afengzi.design.adapter.adapter.impl;

import com.afengzi.design.adapter.adaptee.Duck;
import com.afengzi.design.adapter.adapter.Turkey;

/**
 * Created by klov on 2015/11/3.
 */
public class TurkeyAdapter implements Turkey {
    private Duck duck ;

    public TurkeyAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
