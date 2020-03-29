package com.dc.design.singleton;

/**
 * @Description:  枚举，推荐使用
 * 借助JDK1.5添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建的对象。
 * @Author: chenhuaidong
 * @Date: 2020/3/28
 */
public class singleton8 {
    Singleton singleton = Singleton.INTANCE;
    Singleton singleton2 = Singleton.INTANCE;
}

enum Singleton{
    INTANCE;//属性
    public void sayOK(){
        System.out.println("OK");
    }

}