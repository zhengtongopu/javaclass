package exception;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Exception </p>
 * <p>Description: 异常处理 </p>
 * <p>
 * 保证系统出现不致命的错误时不会让程序直接崩溃
 * 快捷键：选中代码块后ctrl+alt+t
 * <p>
 * 执行过程中所发生的异常事件可分为两类
 * 1. Error（错误）：java虚拟机无法解决的严重错误，比如JVM系统内部错误，资源耗尽错误，栈溢出，内存溢出等，属于严重错误，系统会崩溃
 * 2. Exception（异常）:其他因编程错误或者偶然的外在因素导致的一般性问题，可以使用针对性代码进行处理。例如空指针访问，试图读取不存在文件，网络连接中断等
 * <p>
 * Exception分为运行时异常[程序运行时发生的异常]和编译时异常[编写程序时由编译器检查出来的异常]
 * <p>
 * 异常体系：【Exception.png】
 * <p>
 * 运行时异常，编译器检查不出来，一般是编程时的逻辑错误，是程序员应该避免其出现的异常。可以不做处理。
 * 编译时异常必须处理
 * <p>
 * 常见运行时异常：
 * 1. NullPointerException: 空指针异常
 * 2. ArithmeticException: 算术异常
 * 3. ArrayIndexOutOfBoundsException：数组下标越界异常
 * 4. ClassCastException：类型转换异常。当试图将对象强制转换为不是实例的子类时，抛出该异常
 * 5. NumberFormatException： 数字格式不正确异常。当应用程序试图将字符串转换成一种数值类型，但是该字符串不能专委会适当格式时，跑出该异常 => 该异常可以确保输入的是满足条件的数字
 *
 * 常见的编译异常：
 * 1. SQLException: 操作数据库时，查询表可能发生的异常
 * 2. IOException: 操作文件时，发生的异常
 * 3. FileNotFoundException: 当操作一个不存在的文件时，发生异常
 * 4. ClassNotFoundException: 加载类，而该类不存在时，异常
 * 5. EOFException: 操作文件，到文件末尾，发生异常
 * 6. IllegalArgumentException: 参数异常
 *
 * <p>Date: 2022-05-30  19:24 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Exception_ extends Throwable {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            double result = num1 / num2;
            System.out.println(result);
        } catch (java.lang.Exception e) {
//            throw new RuntimeException(e);
            System.out.println("异常");
        }
        System.out.println("程序还在执行");
        /*
            异常
            程序还在执行
         */

    }


}