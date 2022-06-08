package arraysclass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArraysMethod </p>
 * <p>Description: Arrays类常用方法 </p>
 * <p>
 * Arrays类 包含了一系列静态方法，用于管理或者操作数组（如排序和搜索）
 *
 * <p>Date: 2022-06-04  23:17 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
     常用方法：
     toString(Object[] / int[] / double[] / ...) 遍历数组，返回一个字符串，里面包含了数组所有的元素
     sort(Object[] / int[] / double[] / ...) 数组排序，默认是从小到大的升序，排序后悔直接影响到元数组
     sort(Object[] / int[] /... , Comparator<> c)
 */

/*
    指定排序的底层源码，先调用TimSort.sort方法
    public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a);
        } else {
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, c);
            else
                TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }

    然后TimSort.sort方法调用二叉排序方法binarySort()，其底层最重要的判断源码如下
             *   Invariants:
             *   pivot >= all in [lo, left).
             *   pivot <  all in [right, start).
                while (left < right) {
                int mid = (left + right) >>> 1; //无符号右移，等同于除以2
                if (c.compare(pivot, a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            assert left == right;
*/

public class ArraysMethod {
    public static void main(String[] args) {
        String[] objects = {"jack", "tom", "nishi"};
        System.out.println("String = " + Arrays.toString(objects)); //String = [jack, tom, nishi]
        Integer[] array = {13, 23, 11, 2, 412, 41};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [2, 11, 13, 23, 41, 412]
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }); //[412, 41, 23, 13, 11, 2]
        System.out.println(Arrays.toString(array));
//        System.out.println(4 <<< 1);

//        Arrays.sort(array, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
    }
}