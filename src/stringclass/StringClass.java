package stringclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: StringClass </p>
 * <p>Description: String类  用于保存字符串，字符使用unicode编码，一个字符占2个字节（不论英文汉字）</p>
 * <p>
 * 1. String类实现了Serializable接口，说明String类可以串行化，可以在网络上传输
 * 2. String类实现了Comparable接口，说明String类之间可以做比较，比如说比较大小等
 * <p>
 * 细节与特性
 * 1. String类内部有很多构造器，常用的构造器如下所写。
 * 2. String类是final类，不能被继承
 * 3. String类有属性 private final char value[]; 用于存放字符串内容(推荐查看源代码)
 * ※注意！！：value数组被final修饰，一旦被赋值，则value所指向的引用地址即不可修改，但value数组内的单个字符是可以改变的（例子在下面多行注释代码块中）
 * <p>
 * 创建String对象的方式：(具体讲解在下方)
 * 1. String s = "123";
 * 2. String s = new String("123");
 *
 * String的几个特性：
 * 1.String s = "hello" + "abc";    编译器会主动优化该语句，判断创建的常量池对象是否有引用指向 => String s = "helloabc";
 * 2. String s = a + b; 该语句的执行流程见下方
 *
 * <p>Date: 2022-06-01  00:14 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

        /*
            String类常用构造器：
                String str = new String();
                String str = new String(String);
                String str = new String(char[]);
                String str = new String(byte[], int, int);
                String str = new String(byte[]);
         */

        /*
            String类内部关于value数组的源代码：
            @Stable
            private final byte[] value;

            value数组被final修饰，一旦被赋值，则value所指向的引用地址即不可修改，但value数组内的单个字符是可以改变的：
            final char[] value = {'a', 'b', 'c'};
            value[0] = 'H'; //不会报错,只是对内部单个元素做修改
            char[] v2 = {'a', 'b'};
            value = v2; //报错，无法让value数组指向v2数组
         */

        /*
             创建String对象的方式：
             1. String s = "123";
             先从常量池中查看是否有"123"数据空间，如果有，则让s直接指向在常量池的该空间，如果没有，则在常量池中创建后指向。最终s指向的是常量池的空间地址。

             2. String s = new String("123");
             先在堆中创建空间，里面包含了value数组属性，指向常量池中的“123”空间，如果常量池中不存在“123”，则创建后让value指向改地址，最终s指向的是堆中的地址
         */

        /*
            String d = "hsp";
            String e = new String("hsp");
            System.out.println(d == e.intern());
            System.out.println(e == e.intern());
            当调用intern方法时，如果池已经包含一个等于此String对象的字符串，则返回池中的字符串，否则，将此String对象添加到池中，并返回此String对象的引用
         */

        /*
            String a = "hello";
            String b = "abc";
            String c = a + b;
            总共创建了几个对象？

            具体步骤：（JDK9之前）
           1.  先创建StringBuilder sb = new StringBuilder();
           2. 执行sb.append("hello");
           3. 再执行一次sb.append("hello");
           4. 返回String c = sb.toString(); //返回一个String对象，并在常量池中创建“helloabc
           @Override
            @IntrinsicCandidate
            public String toString() {
                // Create a copy, don't share the array
                return isLatin1() ? StringLatin1.newString(value, 0, count)
                                  : StringUTF16.newString(value, 0, count);
            }

            因此总共创建了5个对象

            ※JDK9以后不再使用StringBuilder对字符串的+操作进行处理，最新的是使用DirectMethodHandle类和StringConcatHelper类
         */




public class StringClass {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char[] ch) {
        str = "JAVA";
        ch[0] = 'H';
    }
    public static void main(String[] args) {
        String a = "hello";
        String b = "zhengtong";
        String c = a + b;

        String d = "hsp";
        String e = new String("hsp");
        System.out.println(d.equals(e));
        System.out.println(d == e);
        System.out.println(d == e.intern());
        System.out.println(e == e.intern());

//        下面代码输出的是什么？ ※非常重要的练习题，画内存图搞懂
        StringClass stringClass = new StringClass();
        stringClass.change(stringClass.str, stringClass.ch);
        System.out.print(stringClass.str + " and ");
        System.out.println(stringClass.ch); //hsp and Hava
    }
}