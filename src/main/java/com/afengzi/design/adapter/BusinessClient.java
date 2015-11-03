package com.afengzi.design.adapter;

import com.afengzi.design.adapter.adaptee.Duck;
import com.afengzi.design.adapter.adaptee.impl.MallarDuck;
import com.afengzi.design.adapter.adapter.Turkey;
import com.afengzi.design.adapter.adapter.impl.TurkeyAdapter;

/**
 * Created by klov on 2015/11/3.
 * 客户端程序</br>
 */
public class BusinessClient {
    private Turkey turkey ;

    /**
     * 客户端要求必须是Turkey类型,所以需要适配Duck类型
     * @param turkey
     */
    public BusinessClient(Turkey turkey) {
        this.turkey = turkey;
    }

    public void doBusiness(){
        turkey.gobble();
        turkey.fly();
    }

    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        Turkey turkey1 = new TurkeyAdapter(duck);
        BusinessClient client = new BusinessClient(turkey1);
        client.doBusiness();
    }
}
