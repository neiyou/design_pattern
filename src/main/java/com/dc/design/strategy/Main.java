package com.dc.design.strategy;

import com.dc.design.strategy.impl.FlyWithWings;

/**
 * @Description: 测试类
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class Main {
    public static void main(String[] args) {
        Duck mallerd= new MallardDuck();//new时会被委托给flyBehavior、quackBehavior对(也就是对应实例），该对象是在野鸭构造器中设置的
        mallerd.performFly();
        mallerd.performQuack();
        mallerd.setFlyBehavior(new FlyWithWings());//这里调用继承来的set方法，把飞翔授予给野鸭，这样野鸭就能飞了
        mallerd.performFly();
    }
}
