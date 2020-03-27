package com.dc.design.think.segregation;

/**
 * @Description: 接口隔离原则demo
 * @Author: chenhuaidong
 * @Date: 2020/3/27
 */
public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        C c = new C();//C类通过接口去依赖（使用）D类
        c.depend1(new D());
        c.depend3(new D());
        c.depend4(new D());
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现operation3");
    }

}

class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.print(" D -> 1");
    }

    @Override
    public void operation4() {
        System.out.println("D->4");
    }

    @Override
    public void operation5() {
        System.out.println("D->5");
    }
}

class A {// A类接口通过Interface1 、Interface2 依赖（使用）B类，但只会用到1,2,3方法

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}
class  C{ //C类通过接口Interface1，Inteface3 依赖使用D类，但是只会用到1,4,5方法
    public void depend3(Interface3 i){
        i.operation4();
    }
    public void depend4(Interface3 i ){
        i.operation5();
    }
    public  void depend1(Interface1 i ){
        i.operation1();
    }
}