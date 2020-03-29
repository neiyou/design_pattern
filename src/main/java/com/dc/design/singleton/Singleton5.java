//package com.dc.design.singleton;
//
///**
// * @Description: 懒汉式（线程安全），执行getInstacne都要同步，效率低
// * @Author: chenhuaidong
// * @Date: 2020/3/28
// */
//public class Singleton5 {
//
//}
//class Singleton{
//    private static Singleton instance;
//    private Singleton(){
//    }
//
//    //提供一个静态的公有方法，当使用到该方法时，才去创建instance，即懒汉式
//    //加入同步处理的代码，解决线程安全问题,
//
//    public  static Singleton getInstance(){
//        if(instance == null){
//            synchronized(Singleton.class){//并不能起到线程同步作用。
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }
//}