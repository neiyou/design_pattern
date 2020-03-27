# 设计模式(Design pattern)

# 1.设计模式的目的

编写软件过程中，coder面临来自 耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性等多方面的挑战，设计模式为了让程序（软件）具有更好的

代码重用性（相同的代码，不用多次编写）

可读性（变成规范性，便于其他coder的阅读和理解）

可扩展性（当需要增加新的功能时，非常的方便，称为可维护）

可靠性（当增加新功能后，对原来的功能没有影响）

使程序呈现高内聚，低耦合的特性



# 2.七大原则

### 1.单一职责原则

1. 降低类的复杂度，一个类值负责一项职责。
2. 提高类的可读性，可维护性
3. 降低变更引起的风险
4. 通常情况下，我们应当遵守单一原则，只有逻辑足够简单，才可以在代码级违反单一职责原则“只有类中方法数量足够少，可以在方法级别保持单一职责原则。

DEMO：比如订单类只负责订单、 dao

### 2.接口隔离原则（Interface Segregation principle)

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上

DEMO：拆分接口，类与他需要的接口建立依赖关系  

```java
public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
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
 
```



### 3.依赖倒转

1. 高层模块不应该依赖底层模块，二者都应该**依赖其抽象**

2. 抽象不应依赖细节，细节应该依赖抽象

3. 依赖倒转的中心思想是面向接口编程

4. 依赖倒转原则是基于：相对于细节的多边性，**抽象的东西要稳定的多**，以抽象为基础搭建的架构比以细节为基础的架构要稳定的多，在java中，抽象指的是接口或抽象类，细节就是具体的实现类，

5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

   **依赖传递分三种方式：**

   1通过**接口传递**实现依赖。

   ```java
   interface IOpenAndClose{
   	public void open(ITV tv);//抽象方法，接收接口
   }
   
   interface ITV{//ITV接口
   	public void play();
   }
   
   //实现接口
   class OpenAndClose implements IOpendAndClose{
       public void open(ITV tv){
           t.paly();
       }
   }
   ```

   2.通过**构造方法**依赖传递。

   ```java
   interface IOpenAndClose{
   	public void open();//抽象方法
   }
   
   interface ITV{//ITV接口
   	public void play();
   }
   
   //实现接口
   class OpenAndClose implements IOpendAndClose{
   	public ITV tv;//成员
   	public OPenAndClose(ITV tv){//构造器
   		this.tv = tv;
   	}
       public void open(){
           this.tv.paly();
       }
   }
   ```

   3.通过**setter**方法传递

   ```java
   interface IOpenAndClose{
   	public void open();//抽象方法
       public void setTv(ITV tv);
   }
   
   interface ITV{//ITV接口
   	public void play();
   }
   
   class OPendAndClose implements IOpenAndClose{
       private ITV tv;
       public void setTv(ITV tv){
           this.tv = tv;
       }
       public void open(){
   		this.tv.play();
       }
   }
   ```

注意点：

1.底层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好。

2.变量的声明类型尽量使抽象类或接口，这样我们的变量引用和实际对象间，就存在了一个缓冲层，利于程序扩展和优化。

3.继承时遵循里氏替换原则

### 4.里氏替换原则

1.**尽量不要重写父类的方法**

2.所有引用基类的地方必须能透明地使用其子类的对象

3.在适当的情况下，可以通过聚合，组合，依赖来解决问题

### 5.开闭原则(Open Closed Principle)

1.变成最基础，组重要的原则

2.一个软件实体如类，模块和函数应该对扩展开放（对提供方），对修改关闭(对使用方)，用抽象构建框架，用实现扩展细节。

3.当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。

4.变成中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。




## 结构型
装饰器（Decorator Pattern）  


## 行为型
观察者（Observer Pattern）  
策略（strategty Pattern)  
