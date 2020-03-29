//package com.dc.design.singleton;
//
///**
// * @Description:  懒汉式（线程不安全）
// * @Author: chenhuaidong
// * @Date: 2020/3/28
// */
//public class Singleton3 {
//    public static void main(String[] args) {
//    }
//}
//class Singleton{
//    private static Singleton instance;
//    private Singleton(){
//    }
//
//    //提供一个静态的公有方法，当使用到该方法时，才去创建instance，即懒汉式
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
