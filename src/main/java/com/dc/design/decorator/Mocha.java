package com.dc.design.decorator;

/**
 * @Description:
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
