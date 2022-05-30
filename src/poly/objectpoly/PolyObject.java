package poly.objectpoly;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: PolyObject </p>
 * <p>Description: 对象的多态 </p>
 * <p>Date: 2022/05/22/19:17 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class PolyObject {
    /**
     * \
     * <p>
     * 对象多态的基本入门
     * 多态的前提是，两个对象或者类存在继承关系
     * </p>
     * <p>
     * 重要概念：多态的向上转型
     * 本质：父类的引用指向了子类的对象 例如Animal animal = new Cat()
     * 语法：父类类型 引用名 = new 子类类型()；
     * 特点：编译类型看左边，运行类型看右边
     * 可以调用父类中的所有成员（遵守访问权限）
     * 不能调用子类中的特有成员 (能否调用哪些成员是由编译类型决定的)
     * 最终运行效果看子类的具体体现 (方法的具体实现由运行类型决定)
     * ※但是要注意，属性没有重写这一说，属性的值要看编译类型！！！！
     * </p>
     * <p>
     * 重要概念：多态的向下转型
     * 语法：子类类型 引用名 = (子类类型)父类引用
     * 等同于强制转换，只能强制转换父类的引用，不能强制转换父类的对象
     * 要求父类的引用必须指向的是当前目标类型的对象 （必须先向上转型，即 Animal animal = new Cat()，然后再对animal强制转型为Cat类）等同于将编译类型转换
     * 当向下转型后，可以调用子类类型中的所有成员
     * </p>
     * <p>
     * 多态的细节：
     * 属性没有重写这一说，属性的值要看编译类型
     * instanceof 比较操作符，用于判断对象的运行类型是否为XX类型或者XX类型的子类型
     * </p>
     * <p>
     *
     * </p>
     */

    public static void main(String[] args) {
//        animal的编译类型是animal，运行类型是dog
//        向上转型
        Animal animal = new Dog();
//        因为运行类型是Dog，所以在Dog类中寻找cry()方法
        animal.cry(); // Dog cry()
//        animal的编译类型是animal，运行类型是cat
        animal = new Cat();
        animal.cry(); // Cat cry()
//        报错，无法调用子类中的特有成员
//        animal.catchMouse();


//        先向上转型
        Animal animal1 = new Cat();
//        再向下转型
        Cat cat = (Cat) animal1;
//        向下转型后可以使用子类类型的所有成员
        cat.catchMouse();

        /**
         * 多态细节的实现
         */


//        属性没有重写之说，属性的值看编译类型
        Base base = new Sub();
        System.out.println(base.count); //10;


//        instanceof比较操作符 判断对象的运行类型
        Base bb = new Sub();
        Sub ss = new Sub();
        System.out.println(ss instanceof Base); //true ss引用属于Base的子类
        System.out.println(bb instanceof Sub); // true


    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}