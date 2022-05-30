package final_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: TestFinal </p>
 * <p>Description: final关键字 不可以被修改</p>
 *
 * 使用场景：
 * ①不希望某个类被继承时
 * ②当不希望父类的方法被覆盖/重写时
 * ③当不希望类的某个数学的值被修改时，如常量 public final static double PI = 3.14;
 * ④当不希望某些局部变量被修改，如方法内的局部变量
 *
 * 使用细节：
 * ①final修饰的被称为常量，一般用XX_XX（大写，下划线）表示
 * ②常量在定义时必须赋值（也可以在构造器或者代码块里赋值）（推荐直接在定义时赋值，简单明了）
 * ③【重要】如果final修饰的属性是静态的，则初始化的位置只能是定义时或者静态代码块
 * ④final类不能被继承，但是可以实例化对象
 * ⑤final方法可以被继承，不能被重写（延伸，静态方法也不可以被重写）
 * ⑥一般来说，如果一个类已经是final类，则没有必要再将方法修饰为final方法
 * ⑦final不能修饰构造器
 * ⑧final与static搭配使用效率更高，【重要】不会导致类加载
 * ⑨包装类（Integer, Double, Float, Boolean等）都是final类，String也是final类
 *
 * <p>Date: 2022-05-26  21:23 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class TestFinal {
    public static void main(String[] args) {
//        不会加载类（代码块没有调用）
        System.out.println(Circle.PI);
//        3.14

//        这样调用类中的静态变量，则会加载类
        System.out.println(Circle.testNum1);
//        通过静态代码块给PI赋值
//        3
    }
}

class Circle {
    private double radius;
//    定义时赋值
    public final static double PI = 3.14;
    public final int testNum;
    public static int testNum1 = 3;

    static {
        System.out.println("通过静态代码块给PI赋值");
//        PI = 3.14;
    }

    public Circle() {
        System.out.println("通过构造器给testNum赋值");
        testNum = 44;
    }

    public final void test() {
        System.out.println("该类不可以被重写");
    }
}