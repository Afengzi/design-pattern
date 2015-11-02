package com.afengzi.design.decorative;

import com.afengzi.design.decorative.component.Espresso;
import com.afengzi.design.decorative.component.HouseBlend;
import com.afengzi.design.decorative.decorator.Milk;
import com.afengzi.design.decorative.decorator.Mocha;
import com.afengzi.design.util.LogHelper;

/**
 * Created by klov on 2015/11/2.
 */
public class OrderCoffe {

    public static void main(String[] args) {
        OrderCoffe coffee = new OrderCoffe();
        coffee.createMochaEspressoCoffee();
        coffee.createMochaHouseBlendCoffee();
        coffee.createMilkMochaHouseBlendCoffee();
    }

    private void createMochaEspressoCoffee(){
        //初始化组件
        Espresso espresso = new Espresso();
        //初始化装饰者
        Mocha mocha = new Mocha(espresso) ;
        LogHelper.printInfo("begin create a mocha Espresso coffee !");
        LogHelper.printInfo("mocha cost : "+mocha.cost());
        LogHelper.printInfo("mocha description : "+mocha.getDescription());
        LogHelper.printInfo("create a mocha Espresso coffee finish!");
    }

    private void createMochaHouseBlendCoffee(){
        HouseBlend houseBlend = new HouseBlend();
        Mocha mocha = new Mocha(houseBlend);
        LogHelper.printInfo("begin create a mocha HouseBlend coffee !");
        LogHelper.printInfo("mocha cost : "+mocha.cost());
        LogHelper.printInfo("mocha description : "+mocha.getDescription());
        LogHelper.printInfo("create a mocha HouseBlend coffee finish !");

    }

    private void createMilkMochaHouseBlendCoffee(){
        //初始化组件(被装饰者)
        HouseBlend houseBlend = new HouseBlend();
        //初始化组件(被装饰者)，但同时也是装饰者
        Mocha mocha = new Mocha(houseBlend);
        //初始化装饰者
        Milk milk = new Milk(mocha) ;
        LogHelper.printInfo("begin create a milk mocha HouseBlend coffee !");
        LogHelper.printInfo("mocha cost : "+milk.cost());
        LogHelper.printInfo("mocha description : "+milk.getDescription());
        LogHelper.printInfo("create a milk mocha HouseBlend coffee finish !");
    }
}
