package innerclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: LocalInnerClass </p>
 * <p>Description:局部内部类： 局部内部类是定义在外部类的局部位置，比如说方法或代码块中，并且有类名
 * <p>
 * 局部内部类的细节
 * ①可以直接访问外部类的所有成员，包含私有的。
 * ②不能添加访问修饰符（指public,protected,static等等），因为他的地位就是一个局部变量。局部变量不能是有修饰符。但是可以使用final修饰，因为局部变量也可以使用final
 * ③作用域：仅仅在定义它的方法或代码块中。
 * ④局部内部类----访问--->外部类的成员[访问方式：直接访问]
 * ⑤外部类----访问--->局部内部类的成员[访问方式：先创建对象，再访问（但必须在作用域内）]
 * ⑥外部其他类不能直接访问局部内部类
 * ⑦如果外部类和局部内部类的对象重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问
 * </p>
 * <p>Date: 2022-05-28  17:54 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.m1();
    }
}


class Outer1 {
    private String name;
    private int n1;
    private int n2 = 100;

    {
        System.out.println("普通代码块");
//        Inner1 inner = new Inner1(); 报错，因为不在内部类的作用域内
    }

    static {
        System.out.println("静态代码块");
    }

    public Outer1() {
    }

    public Outer1(String name, int n1) {
        this.name = name;
        this.n1 = n1;
    }

    public void m1() {
        final class Inner1 { //局部内部类 只可以用final或者默认修饰符修饰
            private int a = 10;
            private int n2 = 300;

            public void show() {
//                可以直接访问外部类的任何成员，即使该成员是private
                System.out.println(a + " 内部类 n1 " + n1); //10 内部类 n1 0
//                成员名相同的情况下，默认为就近原则，即优先访问内部类的成员
                System.out.println("n2 = " + n2); //n2 = 300
//                如果想访问外部类的成员，则使用(外部类名.this.成员)
                System.out.println("外部类的n2 = " + Outer1.this.n2); //外部类的n2 = 100
            }

        }
//        作用域仅仅在定义它的方法或者代码块中
//        访问局部内部类的成员需要先创建对象，然后再按照类成员的调用方法使用即可
        Inner1 inner = new Inner1();
        inner.show();
        m2(inner.a); //m2的a ： 10
    }

    public void m2(int a) {
        System.out.println("m2的a ： " + a);
    }
}

class Other1 {
    public void m1() {
//        Inner1 inner = new Inner1(); //报错，外部类不能直接访问局部内部类
    }
}