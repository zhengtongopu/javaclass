package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Collection_ </p>
 * <p>Description: 集合的理解及Collection接口的方法 </p>
 * <p>
 * 数组长度必须被指定，而且一旦制定，就不能更改，并且保存的必须为同一类型的元素。因此，使用数组进行增加元素比较麻烦。
 * <p>
 * 集合的好处：
 * 1. 可以动态保存任意多个对象，使用比较方便。
 * 2. 提供了一系列方便的操作对象的方法：add, remove, set, get等
 * 3. 使用集合添加，删除新元素的代码很简洁
 * <p>
 * 集合的细节知识点：
 * 1. 集合主要是两组（单列集合，双列集合）。
 * 2. Collection接口主要有两个重要的子接口List，Set，他们的实现子类都是单列集合。
 * 3. Map接口实现的子类都是双列集合，存放K-V（键，值）。
 * 4. 记住两张结构图[Collection.png, Map.png]
 * <p>
 * Collection接口实现类的特点：
 * 1. Collection实现子类可以存放多个元素，每个元素都可以是Object。
 * 2. 有些Collection实现类，可以存放重复的元素(List)，有些不可以(Set)。
 * 3. 有些Collection的实现类，有些是有序的(List)，有些是无序的(Set)。
 * 4， Collection接口没事直接的实现子类，是通过他的子接口Set和List来实现的。
 * <p>
 * Collection接口的常用方法，见下方
 *
 * <p>Date: 2022-06-04  10:32 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    Collection接口常用方法，以ArrayList子类为例：
    add(Object) 添加单个元素
    remove(object/int) 删除指定元素或者删除指定下标元素
    contains(Object) 查找元素是否存在，返回一个boolean型
    size() 返回元素的个数
    isEmpty() 判断集合是否为空
    clear() 清空集合
    addAll(Collection c) 添加多个元素。
    containsAll(collection c) 判断多个元素是否同时存在
    removeAll(Collection c) 删除多个元素
 */



public class Collection_ {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        List list2 = new ArrayList();
        list2.add("zheng");
        list2.add("tom");
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));
    }
}