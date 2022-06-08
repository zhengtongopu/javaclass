package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Iterator_ </p>
 * <p>Description: 迭代器(Iterator) </p>
 * <p>
 * 1. Iterator对象称为迭代器，主要用于遍历Collection集合中的元素。
 * 2. 所有实现了Collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象，即可以放回哦一个迭代器。
 * 3. Iterator的结构，见下方
 * 4. Iterator仅用于遍历集合，Iterator本身并不存放对象
 * <p>
 * 补充：遍历实现Collection接口的对象的方式之增强for循环。
 * 增强for循环，可以代替iterator迭代器，特点：是简化版的iterator（底层就是依靠iterator实现的），本质一样，只能用于遍历集合和数组
 *
 * <p>Date: 2022-06-04  11:39 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    Iterator迭代器的执行原理：
    Iterator iterator = coll.iterator(); //得到一个集合的迭代器
    //hasNext()：判断是否还有下一个元素
    while(iterator.hasNext()) {
        //next()：指针下移，将下移以后的集合位置上的元素返回,编译类型是Object
        // 使用it.next()之前必须调用hasNext方法，如果不调用且下一条记录不存在或者无效，会抛出NoSuchElementException异常
        System.out.println(iterator.next());
    }

    注意※：
    1. 当退出while循环后，此时iterator迭代器指向最后的元素
    2. 如果再次希望迭代集合，需要重置迭代器
    iterator = coil.iterator();

    补充：增强for循环
    快捷键：I
    for (Object o :) {

        }
 */

public class Iterator_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);


//        Iterator迭代器的执行原理：
        Iterator iterator = list.iterator(); //得到一个集合的迭代器
        //hasNext()：判断是否还有下一个元素
        while (iterator.hasNext()) {
            //next()：指针下移，将下移以后的集合位置上的元素返回
            // 使用it.next()之前必须调用hasNext方法，如果不调用且吓一跳纪录无效，会抛出NoSuchElementException异常
            Object obj = iterator.next();
            System.out.println(obj);
        }
        /*
        jack
        10
        true
         */

//        itit快捷键
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//
//        }
//        不重置迭代器，不会执行下面语句
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


//        第二次遍历集合(重置迭代器)
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}