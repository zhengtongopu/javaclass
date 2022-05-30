package innerclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: MemberInner </p>
 * <p>Description: 成员内部类 </p>
 * <p>
 * ①定义在外部类的成员位置上(没有static修饰)，可以访问外部类的所有成员，包含私有的
 * ②可以添加任意的访问修饰符，因为他就是一个成员
 * ③作用域：在整个外部类都可以通过创建成员内部类对象后随意调用
 * ④成员内部类....访问--->外部类成员[直接访问]
 * ⑤外部类----访问--->内部成员类，先创建对象，再访问
 * ⑥外部其他类----访问--->内部成员类
 * ⑦外部类与内部类成员重名时，遵循就近原则，如果想访问外部类成员，方法与之前一致
 *
 * <p>Date: 2022-05-28  23:03 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class MemberInner {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.t1();

//        外部其他类访问内部类的方式之一
//        outer3.new Inner3();相当于把new Inner3()当做outer3的一个成员进行调用
        Outer3.Inner3 inner3 = outer3.new Inner3();
        inner3.say();
//        第二种方式 在外部类中编写一个方法，返回一个Inner3的对象
        Outer3.Inner3 inner4 = outer3.getInner3();
        inner4.say();

//        第三种方式 等同于第一种
        Outer3.Inner3 inner5 = new Outer3().new Inner3();
    }
}

class Outer3 {
    private int n1 = 10;
    public String name = "jack";

    class Inner3 { //成员内部类
        public void say() {
            System.out.println("n1 = " + n1 + " name = " + name);
        }
    }

    public void t1() {
        Inner3 inner3 = new Inner3();
        inner3.say();
    }

    public Inner3 getInner3() {
        return new Inner3();
    }
}