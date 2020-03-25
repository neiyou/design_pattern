package com.dc.design.strategy.impl;

import com.dc.design.strategy.FlyBehavior;

/**
 * @Description:  翅膀飞翔
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
