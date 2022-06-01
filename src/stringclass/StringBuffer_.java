package stringclass;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: StringBuffer_ </p>
 * <p>Description: StringBuffer类 </p>
 * <p>
 * 1. 直接父类：AbstractStringBuilder类
 * 2. 实现了Serializable接口，即StringBuffer类对象可以串行化
 * 3. 在父类AbstractStringBuilder类中存在属性 char[] value; ※且不是final
 * 4. 该value数组存放字符串内容，保存在堆中
 * 5. StringBuffer是final类，不可被继承
 * 6. 字符内容保存在value数组中，所以在变化（增加，删除）不用每次都更换地址（即创建新对象），因此比String类效率高
 * 7. 相比起StringBuffer类，String类更适合保存字符串常量和保存配置文件等工作
 * <p>
 * 常用构造器，查看下面代码
 * <p>
 * String和StringBuffer之间的转换，如下
 * <p>
 * StringBuffer常用方法，如下
 *
 * <p>Date: 2022-06-01  20:48 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    常用构造器：
    StringBuffer()      不带字符串的空缓冲区，默认初始容量为16
    StringBuffer(CharSequence seq)
    StringBuffer(int capacity)      创建一个指定初始容量大小的空缓存区
    StringBuffer(String str)        初始大小 = str.length + 16
 */

/*
    String和StringBuffer之间的转换：
    →：
    1. StringBuffer sb = new StringBuffer("abc");
    2. sb.append("abc");
    ←:
    1. sb.toString();
    2. new String(sb);
 */

/*
    常用方法：
    sb.append(String / char / int / boolean / double ...);        增
    sb.delete(start, end)       删
    sb.replace(start, end, String)      改
    sb.indexOf()        查询
    sb.insert(index, String)     插入
    sb.length()     长度
 */

/*
//        练习题一：
        String str = null;
        StringBuffer sb1 = new StringBuffer();
        sb1.append(str);
        System.out.println(sb1.length()); //4
        System.out.println(sb1); // numm
        StringBuffer sb2 = null;
        try {
        sb2 = new StringBuffer(str);
        } catch (Exception e) {
        System.out.println(e.getMessage()); //Cannot invoke "String.length()" because "str" is null
        }
        System.out.println(sb2); // null
        -----------------------------------------------------
        sb1.append(str)的底层源代码：调用AbstractStringBuilder类的appendNull方法
                private AbstractStringBuilder appendNull() {
                    ensureCapacityInternal(count + 4);
                    int count = this.count;
                    byte[] val = this.value;
                    if (isLatin1()) {
                        val[count++] = 'n';
                        val[count++] = 'u';
                        val[count++] = 'l';
                        val[count++] = 'l';
                    } else {
                        count = StringUTF16.putCharsAt(val, count, 'n', 'u', 'l', 'l');
                    }
                    this.count = count;
                    return this;
                }
        -----------------------------------------------------
 */

/*
    //        练习题二：要求：价格的小数点前面每三位用逗号隔开, 再输出。
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        StringBuffer sb3 = new StringBuffer(str1);
        for (int i = sb3.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb3 = sb3.insert(i, ",");
        }
        System.out.println(sb3);
 */



public class StringBuffer_ {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
//        append
        sb.append(10);
        sb.append('@');
        sb.append(23.3);
        sb.append(true).append("玉田");
        System.out.println(sb); //hello10@23.3true玉田
//        delete 范围是[start, end)
        sb.delete(7, 10);
        System.out.println(sb);//hello10.3true玉田
//        replace 用字符串替换[start, end)区间内的字符
        sb.replace(8, 9, "kxk");
        System.out.println(sb);//hello10.kxktrue玉田
//        查，查找指定子串在字符串内第一次出现的位置，找不到返回-1
        System.out.println(sb.indexOf("kx"));//8
//        插入    在index的位置插入String，原来索引为index的内容自动后移
        sb.insert(3, "Tiger");
        System.out.println(sb);//helTigerlo10.kxktrue玉田


//        练习题一：
        String str = null;
        StringBuffer sb1 = new StringBuffer();
        sb1.append(str);
        System.out.println(sb1.length()); //4
        System.out.println(sb1); // numm
        StringBuffer sb2 = null;
        try {
            sb2 = new StringBuffer(str);
        } catch (Exception e) {
            System.out.println(e.getMessage()); //Cannot invoke "String.length()" because "str" is null
        }
        System.out.println(sb2); // null

//        练习题二：要求：价格的小数点前面每三位用逗号隔开, 再输出。
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        StringBuffer sb3 = new StringBuffer(str1);
        for (int i = sb3.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb3 = sb3.insert(i, ",");
        }
        System.out.println(sb3);

    }
}