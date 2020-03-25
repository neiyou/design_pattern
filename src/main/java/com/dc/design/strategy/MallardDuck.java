package com.dc.design.strategy;

import com.dc.design.strategy.impl.FlyNoWay;
import com.dc.design.strategy.impl.Quack;

/**
 * @Description: 野鸭
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();//默认
        flyBehavior = new FlyNoWay();//默认不会飞，在后期可以改变
    }

    @Override
    public void display() {
        System.out.println("I'm a real real Mallard");
    }
}
