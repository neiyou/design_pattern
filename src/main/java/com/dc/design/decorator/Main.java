package com.dc.design.decorator;

/**
 * @Description:
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
