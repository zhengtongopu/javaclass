package abstractclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: AbstractClass </p>
 * <p>Description: 抽象类      当父类的某些方法需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类，子类必须实现（重写）抽象方法 </p>
 * <p>
 * 当一个类中存在抽象方法时，则必须将该类声明为abstract类
 * <p>
 * 抽象类的介绍：
 * ①用abstract修饰符修饰一个类，这个类就叫抽象类，修饰一个方法，这个方法就叫抽象方法
 * ②抽象方法内部不允许出现方法体
 * ③抽象类的价值更多作用在于设计，是设计者设计好后，让子类继承并实现抽象类
 * ④抽象类在框架和设计模式中运用的比较多（比如模板设计模式）
 * <p>
 * 抽象类细节：
 * ①抽象类不能被实例化
 * ②抽象类不一定要包含abstract方法，也就是说，抽象类内部可以没有抽象方法
 * ③一旦类包含了抽象方法，则这个类必须声明为abstract
 * ④abstract只能修饰类和方法，不能修饰属性和其他的。
 * ⑤抽象类可以有任意成员（抽象类本质上还是一个类），比如非抽象方法，构造器，静态属性等等
 * ⑥抽象方法不能有主体（方法体）
 * ⑦如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非他自己也声明为抽象类
 * ⑧抽象方法不能使用private, final, static来修饰
 * <p>
 * 抽象类最佳实践-模板设计模式 【TestTemplate.java】
 *
 * <p>Date: 2022-05-26  22:53 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class AbstractClass {
    public static void main(String[] args) {
        Animal animal = new Cat("jhack");
        Cat cat = (Cat) animal;
        System.out.println(animal.getName());
        System.out.println(cat.getName());

        Manager manager = new Manager("jack", 12, 2000, "经理", 1000);
//        System.out.println();
        manager.work();
    }
}


//抽象类的声明
abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

//    public Animal() {
//    }

    //    这里eat实现了也没有什么意义，即父类方法不确定性
//    考虑将该方法设计为抽象方法
//    所谓抽象方法，就是没有实现的方法
//    所谓没有实现，就是指没有方法体
//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么");
//    }
    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Cat extends Animal {
//
//    private String name;

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//    public Cat(String name) {
//        super(name);
//    }


//    public Cat() {
//        super();
//    }

    public Cat(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

//    public String getName() {
//        return this.name;
//    }


}