package array;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArrayAdd02 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/23/23:08 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class ArrayAdd02 {
    public static void main(String[] args) {
        //数组缩小练习
        int[] arr1 = {1, 2, 3, 4, 5, 56};
        Scanner scanner = new Scanner(System.in);
        do {
            int[] arr2 = new int[arr1.length - 1];
            if (arr2.length != 1){
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = arr1[i];
                }
                arr1 = arr2;
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(arr1[i] + "\t");
                }
                System.out.println("是否继续删除 y/n");
                char bottom1 = scanner.next().charAt(0);
                if (bottom1 == 'n') {
                    break;
                }
            } else {
                System.out.println("只剩最后一个元素，不能再缩减");
                break;
            }


        } while (true);
    }
}
