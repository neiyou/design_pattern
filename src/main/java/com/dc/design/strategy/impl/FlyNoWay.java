package com.dc.design.strategy.impl;

import com.dc.design.strategy.FlyBehavior;

/**
 * @Description: 无法飞行
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
