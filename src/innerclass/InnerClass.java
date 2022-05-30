package innerclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: InnerClass </p>
 * <p>Description: 内部类【重点】【难点】：指一个类的内部有完整嵌套另一个类结构
 * <p>
 * 类的五大成员：属性，方法，构造器，代码块，内部类
 * <p>
 * ※内部类最大的特点就是可以直接访问私有属性，并且可以提现类和类之间的包含关系
 * <p>
 * 内部类的分类：
 * ①定义在外部类的局部变量（如方法内）：有类名的叫局部内部类，无类名的叫匿名内部类，匿名内部类是【重点】
 * ②定义在外部类的成员位置上：有static修饰的叫静态内部类，没static修饰的叫成员内部类
 * </p>
 * <p>Date: 2022-05-27  23:08 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class InnerClass {
}

class Outer { //外部类
    private int n1;
    private String str1;
    private static int n2 = 10;

    {
        System.out.println("普通代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public Outer(int n1, String str1) {
        this.n1 = n1;
        this.str1 = str1;
    }

    class Inner {
//        内部类()
    }


}

class Other { //外部其他类
}