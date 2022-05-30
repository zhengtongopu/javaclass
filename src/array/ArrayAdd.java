package array;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArrayAdd </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/23/22:29 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class ArrayAdd {
    public static void main(String[] args) {
        //数组添加
        int[] arr1 = {1, 2, 3, 4};
        //定义一个新的数组，int[] arr2 = new int[arr1.length + 1];
        //拷贝arr1的数据到arr2里
        //将新数据添加到arr2里
        //将arr1指向arr2
        //使用do while控制可添加选项
        Scanner scanner = new Scanner(System.in);
        do {
            int[] arr2 = new int[arr1.length + 1];
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            System.out.println("输入想要添加的数字");
            arr2[arr2.length - 1] = scanner.nextInt();
            arr1 = arr2;
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }
            System.out.println("是否继续添加 y/n");
            char bottom1 = scanner.next().charAt(0);
            if (bottom1 == 'n') {
                break;
            }

        } while (true);
    }


}