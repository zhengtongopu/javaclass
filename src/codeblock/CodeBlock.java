package codeblock;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: CodeBlock </p>
 * <p>Description: 代码块 </p>
 * <p>Date: 2022-05-26  09:31 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/**
 * 代码块属于类的成员，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来
 * 但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用
 * <p>
 * 说明注意：
 * 修饰符可选，要写的话，也只能写static
 * 代码块分为两类，使用static修饰的叫做静态代码块 没有static修饰的叫做普通代码块
 * 逻辑语句可以为任何逻辑语句
 * ;号可以写，也可以省略
 * <p>
 * 代码块的好处：
 * 相当于另一种形式的构造器（队构造器的补充机制），可以做初始化的操作
 * 如果多个构造器中都有重复的语句，可以抽取到初始代码块中，提高代码的重用性
 * <p>
 * 代码块使用细节：
 * <1>static代码块也叫静态代码块，作用就是对类进行初始化
 * <2>类什么时候被加载（重要）：创建对象实例时（new）。创建子类对象实例时，父类也会被加载。使用类的静态成员时（静态属性或者静态方法）(即使是子类使用继承来的父类静态成员)
 * <3>普通代码块，在创建实例对象时，会被隐式调用，被创建一次调用一次，如果只是使用类的静态成员时，普通代码块不会调用
 * <4>static代码块，在类加载时执行，只会执行一次 （注意，类加载和创建类对象不是一件事）
 * <5>创建一个对象时，在一个类的调用顺序是：（重点，难点）【例 CodeBlockDetail.java】
 *      调用静态代码块和静态属性初始化（注意：静态代码快和静态属性初始化的调用优先级一样，如果有多个静态代码快和多个静态变量初始化，则按照他们的定义的顺序调用）
 *      调用普通代码块和普通属性的初始化（注意：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用）
 *      调用构造器
 * <6>构造器的最前面其实隐含了super()和调用普通代码块，静态相关的代码块和属性的初始化，在类加载时就已经执行完毕，因此静态代码块和属性是优先于构造器和普通代码块的执行的
 * <7>创建一个子类对象时（继承关系），他们的静态代码快，静态属性初始化，普通代码块普通属性初始化，构造方法的调用顺序如下：
 *      父类的静态代码块静态属性
 *      子类的静态代码快和静态属性
 *      父类的普通代码块和普通属性初始化
 *      父类的构造方法
 *      子类的普通代码块和普通属性初始化
 *      子类的构造方法
 * <8>静态代码块只能直接调用静态成员（静态属性和静态方法），普通代码块可以调用任意成员
 * <p>
 *
 */

public class CodeBlock {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
//        静态代码块，只会调用一次
//        电影屏幕打开...
//        广告开始...
//        电影开始...
        Movie movie2 = new Movie();
//        电影屏幕打开...
//        广告开始...
//        电影开始...
        System.out.println(Cat.a);
//        cat 静态代码块，只会调用一次
//        99
//        （未调用普通代码块）
        Cat cat = new Cat();
//        cat 普通代码块（创建对象实例，调用普通代码块（静态代码块已经被调用过一次所以这里不显示））
    }
}

class Cat {
    public static int a = 99;

    static {
        System.out.println("cat 静态代码块，只会调用一次");
    }

    {
        System.out.println("cat 普通代码块");
    }
}

class Movie {
    private String name;
    private int price;
    private String director;

    /**
     * 4个构造器都有相同的语句
     * 这样的代码看起来比较冗余
     * 可以把相同的语句，放在一个代码块中即可
     * 当我们不管调用哪个构造器，都会先调用代码块的代码
     * 注意，代码块调用的顺序优先于构造器
     */ {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影开始...");
    }

    static {
        System.out.println("静态代码块，只会调用一次");
    }

    public Movie() {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
    }

    public Movie(String name, int price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, int price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影开始...");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}