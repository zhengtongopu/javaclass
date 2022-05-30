package exception;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: CustomizeException </p>
 * <p>Description: 自定义异常 </p>
 * <p>
 * 当程序中出现了某些异常，但是该异常信息并没有在Throwable子类中描述处理，这时候我们可以自己设计异常类，用于描述该错误
 * <p>
 * 自定义异常的步骤:
 * 1. 自定义类，并继承Exception或者RuntimeException;
 * 2. 如果继承Exception，则属于编译异常
 * 3. 如果继承RuntimeException，则属于运行异常（一般来说，我们都会继承RuntimeException）
 * 4. 之所以一般继承RuntimeException，好处是可以让我们使用默认处理机制（运行异常类型可以交给JVM自动处理）
 *
 * throw和throws：
 * throws是处理异常的一种方法，一般写在方法声明处，后面跟一个异常类型，例： throws FileNotFoundException
 * throw是手动生成异常对象的关键字，一般用于方法体中，后面跟一个异常对象，例： throw new AgeException("年龄需要在18-120之间")
 * <p>Date: 2022-05-31  00:01 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class CustomizeException {
    public static void main(String[] args) {
        try {
            AgeException.f1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    /*
        f1方法
        f1方法的finally
        年龄需要在18-120之间

        注意分析代码，为何是上述输出顺序
     */
}

//自定义异常
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }

    public static void f1() {
        int age = 180;
//    要求范围在18-120之间，否则抛出一个自定义异常
        try {
            System.out.println("f1方法");
            if (!(age >= 18 && age <= 120)) {
    //            通过构造器设置异常信息
                throw new AgeException("年龄需要在18-120之间");
            }
        } finally {
            System.out.println("f1方法的finally");
        }

    }
}