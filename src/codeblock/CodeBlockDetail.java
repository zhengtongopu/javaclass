package codeblock;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: CodeBlockDetail </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-26  11:08 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class CodeBlockDetail {
    public static void main(String[] args) {
//        TestCodeBlock codeblock = new TestCodeBlock();
//        代码方法getN1
//        静态代码块
//        代码方法getN2
//        普通代码块
//        无参构造器

        SubTest st = new SubTest();
//        代码方法getN1
//        静态代码块
//        子类静态代码块
//        代码方法getN2
//        普通代码块
//        无参构造器
//        子类代码块
//        子类构造器被调用
        SubTest st2 = new SubTest();
    }
}

class TestCodeBlock {
    private static int n1 = getN1();
    static {
        System.out.println("静态代码块");
    }
    public int n2 = getN2();

    {
        System.out.println("普通代码块");
    }
    public static int getN1() {
        System.out.println("代码方法getN1");
        return 100;
    }

    public int getN2() {
        System.out.println("代码方法getN2");
        return 200;
    }

    public TestCodeBlock() {
        System.out.println("无参构造器");
    }
}

class SubTest extends TestCodeBlock {
//    public int n2 = getN2();
    static {
        System.out.println("子类静态代码块");

    }
    {
        System.out.println("子类代码块");
    }
    public SubTest() {
        System.out.println("子类构造器被调用");
    }

    @Override
    public int getN2() {
        System.out.println("子类getN2");
        return 0;
    }
}