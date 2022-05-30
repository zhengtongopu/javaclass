package recursion;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: RecursionExercise01 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/03/22:40 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        Test01 t = new Test01();
        System.out.println(t.fibonacci(13));
        System.out.println(t.peach(1));
    }
}

class Test01 {
    /*
    使用递归的方式求出斐波那契数列
    1,1,2,3,4,5,8,13...
    给你一个整数n，求出他的值是多少
     */
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    //猴子吃桃问题
    //每一天都吃剩下桃子的一般，再多吃一个,最后第十天的时候只剩一个，求原来有多少个桃子
    public int peach(int days) {
        if (days == 10) {
            return 1;
        } else if (days >= 1 && days <= 9){
            return (peach(days + 1) + 1) * 2;
        } else {
            System.out.println("error");
            return -1;
        }
    }
}