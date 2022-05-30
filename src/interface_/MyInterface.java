package interface_;

/**
 * 接口：  给出一些没有实现的方法，封装在一起，到某个类要是用的时候，再根据具体情况把这些方法写出来
 * <p>
 * 注意：
 * JDK8以后，接口可以有静态方法，默认方法，即接口中也可以有方法的具体实现。但是声明默认方法时，需要使用default关键字修饰
 * <p>
 * 应用场景：面向接口编程
 * <p>
 * 注意事项和细节：
 * ①接口不能被实例化
 * ②接口内的所有方法都默认是public方法，接口中抽象方法可以不用abstract修饰。
 * ③普通类实现接口时，必须将接口内的所有方法都实现，使用快捷键alt+enter一键生成所有方法。【TestInter.java】
 * ④抽象类实现接口，可以不用实现接口的方法
 * ⑤一个类可以同时实现多个接口（但是一个子类只能继承一个父类）
 * ⑥接口中声明的所有属性都被public static final修饰（即接口实现全局常量）
 * ⑦接口中的属性访问形式：接口名.属性名
 * ⑧一个接口不能继承其他类，但是可以继承多个其他的接口
 * ⑨接口的修饰符，只能是public和默认
 * <p>
 * 接口和继承：
 * ①解决的问题不同：继承的价值在于解决代码的复用性和可读性。接口的价值在于设计，设计好各种规范方法，让其他类实现
 * ②接口让继承更加灵活，继承是满足is-a的关系，而接口只需满足like-a的关系
 * ③接口在一定程度上实现代码解耦（即：接口规范性+动态绑定机制）
 */

//一个接口不能继承其他类，但是可以继承多个其他的接口
public interface MyInterface extends TestInter, TestInter2 {

    //    接口内声明属性
//    等同于public static final double PI = 3.14;
    double PI = 3.14;

    //    接口内声明静态方法
    public static void testStatic() {
    }

    //    接口内声明普通方法，使用default修饰符修饰
    public default void testNormal() {
    }

    //    声明抽象类，可以省略abstract关键字
    public void start();

    //    接口内的方法都必须是public方法（默认自动添加）
    void end();
}

class TestMain {
    public static void main(String[] args) {
//        接口无法被实例化，但是可以声明一个接口类型的对象。
//        new MyInterface();  错误
        MyInterface mi; // 正确，声明一个接口对象。
//        访问接口内声明的属性
        System.out.println(MyInterface.PI);
    }
}
