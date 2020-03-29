//package com.dc.design.singleton;
//
///**
// * @Description: 饿汉式（静态代码块）
// * @Author: chenhuaidong
// * @Date: 2020/3/28
// */
//public class Singleton2 {
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getSingleton();
//        Singleton singleton1 = Singleton.getSingleton();
//        System.out.println(singleton == singleton1);
//        System.out.println(singleton.hashCode());
//        System.out.println(singleton1.hashCode());
//    }
//}
//
////饿汉式（静态变量）
//class Singleton {
//    //1。构造器私有化 外部不能new了
//    private Singleton() {
//
//    }
//
//    //2.本类内部创建对象实例
//    private static Singleton instance;
//
//    static {//在静态代码块中，创建单例对象
//        instance = new Singleton();
//    }
//
//    //3.提供一个公有的静态方法，返回实例对象
//    public static Singleton getSingleton() {
//        return instance;
//
//    }
//}