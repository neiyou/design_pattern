//package com.dc.design.singleton;
//
///**
// * @Description: 双重检查(Double-Check线程安全) 推荐
// * Double-check 概念是多线程开发中常使用到的。 我们进行了两次if(instance == null) 检查，这样就可以保证线程安全了。
// * 这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton == null),直接return实例化对象，也避免反复进行方法同步
// * 线程安全，延迟加载，效率高
// * @Author: chenhuaidong
// * @Date: 2020/3/28
// */
//public class Singleton6 {
//
//}
//
//class Singleton {
//    //volatile -> 可以将修改的值立即同步到主存，相当于轻量级 的syn
//    private static volatile Singleton instance;
//
//    private Singleton() {
//    }
//
//    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
//    public static Singleton getIntance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}
