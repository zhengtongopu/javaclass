package recursion;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Recursion </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/03/21:45 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Recursion {
    public static void main(String[] args) {
        //递归
        Test t = new Test();
        t.test(5);
        System.out.print(t.factorial(3));


        //执行一个递归方法时，就创建一个新的受保护的独立栈空间，且每个栈空间的局部变量独立，不会互相影响。
        //如果递归方法的形参是引用参数（数组，对象）的话，则共享该引用类型的数据

    }
}

class Test {
    //递归方法之递减
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n = " + n);
    }

    //递归方法之阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }

    }
}