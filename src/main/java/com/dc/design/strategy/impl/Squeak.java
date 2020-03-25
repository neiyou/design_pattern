package com.dc.design.strategy.impl;

import com.dc.design.strategy.QuackBehavior;

/**
 * @Description: 吱吱叫
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
