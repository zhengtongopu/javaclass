package array;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArrayCopy </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/23/11:38 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //数组拷贝
        //将int[] a = {10, 20, 30}; 拷贝到arr2数组， 要求空间独立

        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + "\t");

        }
        System.out.println("数组反转");
        //数组顺序反转
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;
        for(int i = 0; i < len / 2; i++){
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}