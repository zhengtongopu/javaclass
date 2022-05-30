package array;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Array </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/23/11:08 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Array {
    public static void main(String[] args) {
        //基本数据类型复制，复制方式为值的拷贝
        //n2的变化不会影响到n1的值
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println(n1);
        System.out.println(n2);

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
        //类似于C的指针操作
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        System.out.println("arr1的元素");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]); //1,2,3,4,5
        }
        System.out.println("arr2的元素");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]); //1,2,3,4,5
        }
        System.out.println("arr2的元素+1后");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 1;
            System.out.print(arr2[i]); //2,3,4,5,6
        }
        System.out.println("arr1的元素");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]); //2,3,4,5,6
        }
    }
}