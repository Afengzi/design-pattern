package com.afengzi.design.facade;

/**
 * Created by klov on 2015/11/3.
 * 外观者模式</br>
 * 简化接口,包装有一群接口的子系统,以简化其接口访问</br>
 * 将客户端程序从一个复杂的子系统中解耦出来</br>
 * 比如一个订单交易系统会有很多接口,但对外部只需要暴漏一个接口即可。这就需要一个外观类包装这一群接口</br>
 *
 * 最少知识原则 Least Knowledge :
 * 尽量不要使用方法返回的对象中的方法,如：
 * Coupon coupon = order.getCoupon();
 * coupon.getStatus();
 * 让order对象提供一个优惠券的状态 order.getCouponStatus();
 *
 * 同时,Least Knowledge 也是 Effective Java中不推荐的用法,返回的coupon对象状态容易在外部被修改。
 *
 * 以上也是高内聚、低耦合原则
 */
public class Facade {
}
