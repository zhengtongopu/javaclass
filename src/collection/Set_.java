package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Set_ </p>
 * <p>Description: Set接口 </p>
 * <p>
 * 基本说明：
 * 1. 无序（添加和取出的顺序不一致），没有索引。
 * 2. 不允许重复添加元素，最多包含一个null。
 * <p>
 * 常用方法：和List接口一样，因为Set接口也是Collection接口的子接口。(以HashSet为例)
 * <p>
 * Set的遍历方式：和Collection的遍历方式一样
 * 1. 可以使用迭代器
 * 2. 增强for。
 * 3. ※不能使用索引遍历（普通for循环）
 *
 * 细节：
 * 1. 添加顺序与取出顺序不一致（无序）
 * 2. 不能存放重复的元素（即使进行重复添加，set内部也只允许保留一个）
 * 3. ※取出的顺序是固定的
 * <p>Date: 2022-06-05  17:49 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Set_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("luck");
        set.add("jack");
        set.add("tom");
        set.add(null);
        set.add(null);
//        添加顺序与取出顺序不一致
//        即使进行重复添加，set内部也只允许保留一个
        System.out.println(set); //[null, luck, tom, jack]
        System.out.println(set); //[null, luck, tom, jack]

//        遍历(迭代器和增强for)
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}