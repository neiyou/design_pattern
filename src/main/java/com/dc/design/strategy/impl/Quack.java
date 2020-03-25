package com.dc.design.strategy.impl;

import com.dc.design.strategy.QuackBehavior;

/**
 * @Description:
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
