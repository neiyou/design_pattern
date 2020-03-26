package com.dc.design.decorator;

/**
 * @Description:
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }

}
