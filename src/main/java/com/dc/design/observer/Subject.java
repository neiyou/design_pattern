package com.dc.design.observer;



/**
 * @Description: 主题
 * @Author: chenhuaidong
 * @Date: 2020/3/26
 */
public interface Subject {
    void resisterObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
