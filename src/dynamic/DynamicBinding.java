package dynamic;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: DynamicBinding </p>
 * <p>Description: java的动态绑定机制 </p>
 * <p>Date: 2022/5/22/21:36 </p>
 *
 * @author <a href="teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */

/**
 * <p>
 * java的动态绑定机制
 * <1>当调用对象方法的时候，该方法会和该对象的内存地址，即运行类型绑定
 * <2>当调用对象属性时，没有动态绑定机制，哪里声明(即编译类型是谁，就是谁声明)，哪里使用。
 * 但是要注意，属性没有重写这一说，属性的值要看编译类型！！！！因此修改对象的值，即base.i = 1;修改的是父类中的i的值
 * </p>
 */
public class DynamicBinding {
    public static void main(String[] args) {
//        向上转型，编译类型为Base，运行类型为Sub
        Base base = new Sub();
//        base.sum1() 方法的实现由运行类型决定，所以就近原则从Sub类开始寻找sum1方法
//        由于Sub类没有sum1方法，因此在父类Base类中寻找
//        Base类中存在sum1方法，但是sum1方法内部调用的getI()方法在子类Sub中也存在
//        根据java动态绑定机制，方法的调用会和对象的运行类型绑定，因此getI()方法会优先使用子类Sub的getI方法
//        因此此时getI() + 10 = sub.i + 10 = 40
        System.out.println(base.sum()); //20
        System.out.println(base.sum1());//40
        System.out.println(base.getI());//30

        Sub sub = (Sub) base;
        System.out.println(sub.sum()); //20
    }
}

class Base {
    int i = 10;

    public int sum() {
        return i + 10;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return getI() + 10;
    }
}


class Sub extends Base {
    int i = 30;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }
}