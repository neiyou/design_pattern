package com.dc.design.strategy.impl;

import com.dc.design.strategy.QuackBehavior;

/**
 * @Description: 哑巴
 * @Author: chenhuaidong
 * @Date: 2020/3/25
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
