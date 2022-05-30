package circle;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Sort </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/21/20:50 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Sort {
    public static void main(String[] args) {
        //冒泡排序
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("*************");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("*************");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
        }
    }
}