package innerclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: StaticInner </p>
 * <p>Description: 静态内部类 </p>
 * <p>
 * ①定义在外部类的成员位置
 * ②使用static修饰
 * ③可以直接访问外部类的所有静态成员，包含私有的，但是不能直接访问非静态成员
 * ④可以添加任意访问修饰符，因为他的地位就是一个类成员
 * ⑤作用域和其他成员一样，在整个类内都可以在创建对象后调用
 * ⑥静态内部类----访问--->外部类成员[直接访问外部所有静态成员]
 * ⑦外部类----访问--->静态内部类成员[创建对象，再访问]
 * ⑧外部其他类----访问--->静态内部类成员
 * ⑨外部类静态成员和静态内部类成员重名时，遵守就近原则，如果要访问外部静态成员，则使用(外部类名.成员名) ※注意：此处没有this，因为静态方法内不允许使用this，super关键字
 *
 * <p>Date: 2022-05-28  23:42 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */


public class StaticInner {
    public static void main(String[] args) {
//        外部其他类访问静态内部类方法一(要考虑访问权限问题)
        Outer4.Inner4 inner4 = new Outer4.Inner4();
//        方式2，在外部类写一个方法，返回静态内部类的对象实例
        Outer4.Inner4 inner5 = new Outer4().getInner4();
//        使用静态方法的话代码更简洁
        Outer4.Inner4 inner6 = Outer4.getInner4_();
    }
}

class Outer4 {
    private int n1 = 10;
    public static String name = "jack";

    static class Inner4 {
        public void say() {
//            不能访问外部类的非静态成员
//            System.out.println(n1);
            System.out.println(name);

        }
    }

    public void n1() {

    }

    public Inner4 getInner4() {
        return new Inner4();
    }

    public static Inner4 getInner4_() {
        return new Inner4();
    }
}