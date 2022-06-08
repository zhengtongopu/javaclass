package collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Collections_ </p>
 * <p>Description: Collections类（工具类） </p>
 * <p>
 * 基本说明：
 * 1. Collections类是一个操作Set，List，Map等集合的工具类。
 * 2. Collections中提供了一系列静态的方法对集合元素进行排序，查询和修改等操作。
 * <p>
 * 排序操作(均为static方法)：
 * 1. reverse(List) 翻转List中的元素的顺序
 * 2. shuffle(List) 对List集合元素进行随机排序
 * 3. sort(List) 根据元素的自然顺序对指定List集合元素按升序排序
 * 4. sort(List, Comparator) 根据指定的Comparator产生的顺序对List集合元素进行排序
 * 5. swap(List, int, int) 将指定的List集合中的i处元素和j处元素进行交换。
 *
 * 查找，替换：
 * 1. Object max(Collection) 根据元素的自然顺序，返回给定集合中的最大元素
 * 2. Object max(Collection, Comparator) 根据Comparator指定的顺序，返回给定集合中的最大元素
 * 3. Object min(Collection)
 * 4. Object min(Collection Comparator)
 * 5. int frequency(Collection, Object) 返回指定集合中指定元素的出现次数
 * 6. void copy(List dest, List src) 将src中的内容复制到dest中。必须先给dest赋值，使其大小与src一样。
 * 7. boolean replaceAll(List list, Object oldVal, Object newVal) 使用新值替换list对象中的所有旧值
 * <p>Date: 2022-06-08  23:07 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(Integer.toString(10));
        list.add(Boolean.toString(true));
        list.add("tom");
        System.out.println(list); //[jack, 10, true, tom]
//                * 1. reverse(List) 翻转List中的元素的顺序
        Collections.reverse(list);
        System.out.println(list); //[tom, true, 10, jack]
//                * 2. shuffle(List) 对List集合元素进行随机排序,可用于抽奖，抽签等
        for (int i = 0; i < 3; i++) {
//            每次输出都不一样
            Collections.shuffle(list);
            System.out.println(list);
            /*
            [tom, jack, 10, true]
            [true, 10, jack, tom]
            [tom, jack, 10, true]
             */
        }
//                * 3. sort(List) 根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println(list); //[10, jack, tom, true]
//                * 4. sort(List, Comparator) 根据指定的Comparator产生的顺序对List集合元素进行排序
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(list); //[10, tom, jack, true]
//                * 5. swap(List, int, int) 将指定的List集合中的i处元素和j处元素进行交换
        Collections.swap(list, 0, 1);
        System.out.println(list); //[tom, 10, jack, true]


//                * 1. Object max(Collection) 根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println(Collections.max(list)); //true
//                * 2. Object max(Collection, Comparator) 根据Comparator指定的顺序，返回给定集合中的最大元素
        System.out.println(Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        })); //jack
//                * 3. Object min(Collection)
        System.out.println(Collections.min(list)); //10
//                * 4. Object min(Collection Comparator)
        System.out.println(Collections.min(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        })); //10
//                * 5. int frequency(Collection, Object) 返回指定集合中指定元素的出现次数
        System.out.println(Collections.frequency(list, "tom")); //1
//                * 6. void copy(List dest, List src) 将src中的内容复制到dest中, 必须先给dest赋值，使其大小与src一样
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            objects.add(null);
        }
        Collections.copy(objects, list);
        System.out.println(objects); //[tom, 10, jack, true]
//                * 7. boolean replaceAll(List list, Object oldVal, Object newVal) 使用新值替换list对象中的所有旧值
        Collections.replaceAll(list, "tom", "scott");
        System.out.println(list); //[scott, 10, jack, true]
    }
}