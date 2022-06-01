package wrapper;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Wrapper </p>
 * <p>Description: 包装类  针对八种基本数据类型相应的引用类型</p>
 * <p>
 * 是一种类，因此可以使用类方法
 * <p>
 * 1. 直接继承Object类的有：Boolean类，Character类
 * 2. 继承Number类的有：Byte, Short, Integer, Long, Double, Float
 * <p>
 * 包装类和基本数据类型的转换 以Integer类为例（自动拆装箱，手动拆装箱）。
 * 以JDK5以前都只能手动拆箱手动装箱，JDK5以后都是自动装箱自动拆箱，自动拆装箱在底层调用的是valueOf方法
 * <p>
 * ※三元运算符要看做一个整体，会自动把类型转换成size最大的那个类，比如说下面的例子
 * <p>
 * 包装类转换成String类，以Integer为例，如下
 * <p>
 * Integer经典面试题，如下例
 * 1. 当输入的值范围不超过[IntegerCache.low, IntegerCache.high] = [-128,
 * 127]这个区间时，valueOf方法直接返回该值（在cache数组中保存）。如果超出这个区间，则new一个新对象。
 * 2. 基本数据类型与对应的包装类做“==”比较时，因为由一方是基本数据类型，因此判断的是值是否相等而不是判断引用是否相等
 *
 * <p>Date: 2022-05-31  23:46 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

    /*
       手动装箱:
       int a = 10;
       Integer integer = new Integer(a);
       或者
       Integer integer = Integer.valueOf(a);

       手动拆箱
       int newA = integer.intValue();
     */

    /*
        自动装箱：
        int a = 10;
        Integer integer = a; //底层是用的仍然是上述valueOf方法
        自动拆箱:
        int newA = integer; //底层用的仍然是上面的intValue方法
     */

    /*
        Object obj = true ? new Integer(1) : new Double(3.0);
        System.out.println(obj); //输出结果是1.0
     */

    /*
        包装类转换成String类：
        Integer i = 100;
        方式一：
            String str = i + "";
        方式二：
            String str = i.toString();
        方式三：
            String str = String.valueOf(i);

        String类转包装类：
            String str = "12345";
            Integer i = Integer.parseInt(str);
        或者是：
            Integer i = new Integer(str);
     */

    /*
    //        Integer经典面试题

            Integer i2 = 1;
            Integer j2 = 1;
            System.out.println(i2 == j2); //T
            Integer i3 = 128;
            Integer j3 = 128;
            System.out.println(i3 == j3); //F
            ------------------------------------------
            阅读Integer.valueOf()源代码：
            @IntrinsicCandidate
            public static Integer valueOf(int i) {
                if (i >= IntegerCache.low && i <= IntegerCache.high)
                    return IntegerCache.cache[i + (-IntegerCache.low)];
                return new Integer(i);
            }
            可以看出，当输入的值范围不超过[IntegerCache.low, IntegerCache.high] = [-128, 127]这个区间时，valueOf方法直接返回该值（在cache数组中保存）
            如果超出这个区间，则new一个新对象。
            因此，上述问题即可以得到解决


            Integer i4 = 128;
            int j4 = 128;
            System.out.println(i4 == j4); //T
            ------------------------------------------
            基本数据类型与对应的包装类做“==”比较时，因为由一方是基本数据类型，因此判断的是值是否相等而不是判断引用是否相等

     */

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer integer = Integer.valueOf(a);
        int newA = integer.intValue();

//        Integer的结果自动转换为Double类型
        Object obj = true ? new Integer(1) : new Double(3.0);
        System.out.println(obj); //输出结果是1.0

//        Integer经典面试题
        Integer i1 = new Integer(1);
        Integer j1 = new Integer(1);
        System.out.println(i1 == j1); //F
        Integer i2 = 1;
        Integer j2 = 1;
        System.out.println(i2 == j2); //T
        Integer i3 = 128;
        Integer j3 = 128;
        System.out.println(i3 == j3); //F
        Integer i4 = 128;
        int j4 = 128;
        System.out.println(i4 == j4); //T
    }
}