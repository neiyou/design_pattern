//package com.dc.design.singleton;
//
///**
// * @Description:  静态类部类
// * 静态类部类不会被装载
// * JVM在装载类的时候是线程安全的，在类的初始化时，别的线程是无法进入的
// * @Author: chenhuaidong
// * @Date: 2020/3/28
// */
//public class Singleton7 {
//}
//class Singleton{
//    private static volatile Singleton instance;
//    private  Singleton(){}
//    //写一个静态类部类，该类中有一个静态属性，Singleton
//    private static class SingletonInstace{
//        private static  final  Singleton INSTANCE = new Singleton();
//    }
//
//    //提供一个静态的公有方法，直接返回
//    public static synchronized Singleton getInstance(){
//        return  SingletonInstace.INSTANCE;
//    }
//}
