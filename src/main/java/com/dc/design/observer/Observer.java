package com.dc.design.observer;

/**
 * @Description: 接口观察者通知
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
