package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ExceptionHandle </p>
 * <p>Description: java的异常处理</p>
 * <p>
 * java提供了两种异常处理方式:
 * 1. try-catch-finally
 * 2. throws
 * 两种处理方法选择其中一种即可。
 * 如果程序员没有显式地处理异常，默认采用throws，并最终抛给JVM处理。
 *
 * <p>Date: 2022-05-30  21:05 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    try-catch-finally处理机制
    try{
        代码可能有异常
    } catch(Exception e) {
        捕获到异常：
        1. 当异常发生时
        2. 系统将异常封装成Exception对象e，传递给catch
        3. 得到异常对象后，程序员自己处理
        4. 如果没发生异常，catch代码块不执行
    } finally {
        不管try代码块是否有异常发生，始终要执行finally代码块
        通常将释放资源的代码放在finally代码块（如关闭文件流，关闭数据库等）

        ※注意：可以有多个catch，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前（同级别子类也可以连续catch），比如（Exception在后，NullPointerException
        在前）。如果发生异常，只会匹配一个catch
        ※注意，可以进行try-finally配合使用，即相当于没有捕获异常，因此如果有异常程序会直接停止。应用场景：不管方式什么，都必须执行某个业务逻辑的时候，比如说需要关闭数据库，关闭文件流等
    }
 */

/*
    throws处理机制
    JVM ---调用--> main方法 ---调用--> f1方法 ---调用--> f2方法（发生异常并抛出）
    JVM（当抛到最高级时，必须处理异常） <--throws--- main方法 <--throws--- f1方法 <--throws--- f2方法
    throws可以将某一级发生的异常向上一级抛出，交给上一级处理。
    可以逐级抛出，最后在JVM（最高级）必须处理
    但是JVM处理异常时，当他输出异常信息后就会退出程序。因此我们一般最高只可以throws到main方法这一级
    throws抛出的可以是他的异常，也可以是他异常的父类

    throws的使用细节：
    1. 对于编译异常，必须处理，使用try-catch或者throws
    2. 对于运行异常，可以不用处理，默认用throws抛给了JVM处理
    3. 子类重写父类的方法并抛出异常时，子类重写的方法所抛出的异常类型，要不是与父类一致，要不是父类抛出异常类型的子类型
    4. 在throws过程中，如果某一阶段已经有try-catch，就相当于处理了异常，就不必继续throws了
    5. ※如果throws抛出的是一个运行异常，则调用该方法的地方，即使不处理该异常也不会报错，因为运行异常可以不处理（如果抛出的是一个编译异常则必须处理，否则报错）

 */

public class ExceptionHandle {
    public static void main(String[] args) {
        System.out.println(Person.method1()); //4
        System.out.println(Person.method2()); //4

        SubThrows subThrows = new SubThrows();
        try {
            subThrows.f1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TryCatch {
    public static void main(String[] args) {
        String str = "XXX";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("必然会执行");
        }
        System.out.println("继续执行");
        //For input string: "XXX"
        //必然会执行
        //继续执行

        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName()); //NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2; //ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Cannot invoke "exception.Person.getName()" because "person" is null

        try {
            int n3 = 10;
            int n4 = 0;
            System.out.println(n3 / n4);
        } finally {
            System.out.println("程序必须执行的代码");
        }
        //程序必须执行的代码
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at exception.TryCatch.main(ExceptionHandle.java:83)


    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }

    public static int method1() {
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return 2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return ++i; //虽然这里写了return ++i，但是因为finally代码块的存在，这里并不会返回，而是会继续执行finally的代码，※但是，++i还是会执行
            // 会将i的值保存为一个临时变量temp = 3；
        } finally {
            return ++i;
        }
    }

    public static int method2() {

        try {
            String[] names = new String[3];
            if (names[1].equals("tom")) { //null字符串使用equals方法时会发生空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu"; //数组下标溢出异常
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return 2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 3; //虽然这里写了return 3，但是因为finally代码块的存在，这里并不会返回，而是会继续执行finally的代码
        } finally {
            return 4;
        }
    }
}

//3. 子类重写父类的方法并抛出异常时，子类重写的方法所抛出的异常类型，要不是与父类一致，要不是父类抛出异常类型的子类型
class TestThrows {
    public void f1() throws Exception {
//        创建一个文件流对象
//        使用throws抛出异常，让f1方法的调用者处理
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}

class SubThrows extends TestThrows {
    @Override
    public void f1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public void f2() {
//        此处调用f3并不报错，因为f3抛出的是一个运行异常，运行异常可以不做处理
        f3();
    }

    public void f3() throws ArithmeticException {

    }
}
