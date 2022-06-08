package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: List_ </p>
 * <p>Description: List接口及方法 </p>
 * <p>
 * 基本介绍：
 * 1. List接口时Collection接口的子接口
 * 2. List集合接口类中的元素的添加和取出顺序一致（是有序的），且可以重复
 * 3. List集合中的每个元素都有其对应的顺序索引，即支持下标索引搜索。
 * 4. List容器中的元素都对应一个整数型的序号记载在其容器中的位置
 * 5. 实现List接口的常用类主要为ArrayList，LinkedList，Vector等
 * <p>
 * List接口的常用方法，见下面
 * <p>
 * List接口的三种便利方式：
 * 1. 增强for
 * 2. 普通for
 * 3. iterator
 *
 * <p>Date: 2022-06-04  12:48 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    add(int index, Object obj) 在index位置插入obj元素
    addAll(int index, Collection c) 从index位置将c集合中的所有元素加进来
    get(int index) 获取下标为index位置的元素
    indexOf(Object obj) 返回obj元素在list中首次出现的位置
    lastIndexOf(Object obj) 返回obj元素在list中最后一次出现的位置
    remove(int index) 删除下标为Index位置的元素，并返回此元素
    set(int index, Object obj) 设置指定index位置的元素为obj，相当于替换，如果该index位置不存在，则抛出异常
    subList(int fromIndex, int toIndex) 返回一个从formIndex到toIndex位置的子集合 [fromIndex, toIndex)
 */

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        list.add(1, "tom");
        System.out.println(list); //[jack, tom, 10, true]
        List list2 = new ArrayList();
        list2.add("zheng");
        list2.add("kk");
        list.addAll(2, list2);
        System.out.println(list); //[jack, tom, zheng, kk, 10, true]、
        System.out.println(list.get(3)); //kk
        System.out.println(list.indexOf("tom")); //1
        System.out.println(list.remove(1)); //tom
        System.out.println(list.subList(0, 4)); //[jack, zheng, kk, 10]
    }
}