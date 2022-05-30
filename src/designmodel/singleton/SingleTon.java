package designmodel.singleton;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: SingleTon1 </p>
 * <p>Description: 单例设计模式：采取一定方式，保证在整个软件系统中，对某个类只存在一个对象实例，并且该类只提供一个取得其对象实例的方法 </p>
 * <p>
 * 注意：饿汉式不存在线程安全问题，懒汉式存在线程安全问题，RunTime类是典型的饿汉式单例模式，可以查看源代码学习
 *
 * <p>Date: 2022-05-26  21:04 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class SingleTon {
    public static void main(String[] args) {
//        这种情况下，其实已经实例化了Cat01类，然后后面并不会用到Cat01的对象
        System.out.println(Cat01.testNum);
//        调用了无参构造器了
//        0

//        懒汉式面对这种调用类中的静态变量，不会创建Cat02的实例对象
        System.out.println(Cat02.testNum);
//        1
    }
}


class Cat01 {

    /**
     * ClassName：Cat01
     *
     * @Description: 饿汉式单例模式
     * <p>
     * 饿汉式实现步骤：
     * ①构造器私有化（防止用户直接new）
     * ②类的内部创建静态对象属性
     * ③向外暴露一个静态的公共方法，以获取对象（getInstance()）
     * ④代码实现
     * <p>
     * 注意：饿汉式的模式下，可能会出现创建了对象，但是未使用导致的资源的浪费
     * @author <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a>
     * @CreateDate: 2022/5/26/21:10
     */

    private String name;
    private static Cat01 cat01 = new Cat01();
    public static int testNum = 0;

    private Cat01(String name) {
        this.name = name;
    }

    public Cat01() {
        System.out.println("调用了饿汉式无参构造器了");
    }

    public Cat01 getInstance() {
        return cat01;
    }
}

class Cat02 {
    /**
     * ClassName：Cat02
     *
     * @Description: 懒汉式    对饿汉式的改良，其流程与饿汉式基本相同
     * <p>
     * 与饿汉式的不同在于，在getInstance()方法中添加判断条件，如果静态属性为空，则new一个对象，否则返回对象本身，示例如下
     * @author <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a>
     * @CreateDate: 2022/5/26/21:15
     */

    private String name;
    private static Cat02 cat02;
    public static int testNum = 1;

    public Cat02(String name) {
        this.name = name;
    }

    public Cat02() {
        System.out.println("调用的是懒汉式无参构造器");
    }

    public Cat02 getInstance() {
//        与饿汉式的不同点
        if (cat02 == null) {
            cat02 = new Cat02();
        }
        return cat02;
    }
}