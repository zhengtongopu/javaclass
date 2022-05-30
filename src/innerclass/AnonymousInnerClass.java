package innerclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: AnonymousInnerClass </p>
 * <p>Description: 匿名内部类 定义在外部类的局部位置，如方法内或者代码块内，没有类名</p>
 * <p>
 * 匿名内部类的特点:
 * ①本质还是一个类
 * ②他还是一个内部类
 * ③该类没有名字（其实是有一个默认的名字）
 * ④同时还是一个对象
 * <p>
 * 基本语法：
 * new 类或者接口（参数列表） {
 * 类体
 * };
 *
 * 细节：
 * ①调用匿名内部类的方法有两种 如下
 * ②可以直接访问外部类的所有成员
 * ③不能添加访问修饰符，因为他的地位就是一个局部变量
 * ④作用域：仅仅在定义它的方法或者代码块里
 * ⑤匿名内部类----访问--->外部类成员[访问方式：直接访问]
 * ⑥外部其他类不能直接访问匿名内部类
 * ⑦如果外部类和匿名内部类的成员重名，遵守就近原则，如果想访问外部类成员，使用[外部类名.this.成员名]的形式调用
 *
 * 匿名内部类的最佳实践：
 * ①当作实参直接传递，简介高效
 *
 *
 * <p>Date: 2022-05-28  19:32 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

//  第一种调用方法
    /*
        new A() {
            @Override
            public void cry() {
                System.out.println("实现接口A的cry方法");
            }
        }.cry();
     */

//    第二种调用方法
    /*
        A testA = new A() {
            @Override
            public void cry() {
                System.out.println("实现接口A的cry方法");
            }
        };
        testA.cry();
     */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();

//        匿名内部类作为实参直接传递，简洁高效
        Outer2.m2(new A() {
            @Override
            public void cry() {
                System.out.println("匿名内部类作为实参传递1111111111");
            }
        });
        Outer2.m2(new A() {
            @Override
            public void cry() {
                System.out.println("匿名内部类作为实参传递2222222222222");
            }
        });
        /*
            传统写法如下，但是如果需要调用多次m2方法，且希望每次cry方法打印的内容均不相同的情况下，就很难实现
            class Outer {
                public static void m2(A aa) {
                    aa = new A() {
                        @Override
                        public void cry() {
                            System.out.println("匿名内部类作为实参传递");
                        }
                    };
                    aa.cry();
                }
            }
         */
    }
}

class Outer2 { //外部类
    private String name;
    private int n1;
    private int n2 = 100;

    {
        System.out.println("普通代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public Outer2() {
    }

    public Outer2(String name, int n1, int n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void m1() {
//        需求：想要使用接口A并创建对象
//        传统方法：写一个新的类B，然后实现接口A，并创建类B的对象
//        分析：假如我们只是使用一次类B的对象，此后不再使用，则按照传统的方法，会造成空间的浪费和代码的冗余
//        因此，可以使用匿名类简化开发，例如下

//        基于接口的匿名内部类
        A testA = new A() {

            @Override
            public void cry() {
                System.out.println("实现接口A的cry方法");
            }
        };

        testA.cry(); //实现接口A的cry方法

//        我们来分析一下testA的编译类型和运行类型
//        编译类型：接口A
//        运行类型，使用testA.getClass()进行判断,结果显示，运行类型为Outer2$1，说明匿名内部类其实内部是默认分配了一个类名
        System.out.println(testA.getClass()); //class innerclass.Outer2$1

//        看底层代码
        /*
            class Outer2$1 implements A {
                @Override
                public void cry() {
                    System.out.println("实现接口A的cry方法");
                }
            }
         */
//        jdk底层在创建匿名内部类Outer2$1后，继续创建一个实例，并把该实例地址返回给testA。
//        对于一个外部类对象来说，匿名内部类只会加载使用一次。（当然，使用testA调用内部类方法可以在作用域范围内随便使用）
        testA.cry();
        testA.cry();
        testA.cry();

//        基于类的匿名内部类 参数列表的内容会传递给构造器
        Father father = new Father("jack") {
            @Override
            public void fatherM1() {
                System.out.println("匿名内部类重写了fatherM1");
            }
        };

        //1. father 编译类型 Father
        //2. father 运行类型 Outer2$2
        //3. 底层会创建匿名内部类
        /*
        class Outer2$2 extends Father{
            @Override
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        }
        */

        father.fatherM1(); //匿名内部类重写了fatherM1
//        father的运行类型为Outer2$2
        System.out.println(father.getClass());//class innerclass.Outer2$2


    }


 public static void m2(A aa) {
        aa.cry();
 }


}

interface A {
    void cry();
}

class Father {
    private String name;

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public void fatherM1() {
        System.out.println("father name : " + this.name);
    }
}