package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: LinkedList_ </p>
 * <p>Description: LinkedList类 </p>
 * <p>
 * 基本说明：
 * 1. LinkedList底层实现了双向链表和双端队列的特点
 * 2. 可以添加任意元素，且元素可以重复，包括null
 * 3. 线程不安全，没有实现同步
 * <p>
 * 底层操作机制：
 * 1. LinkedList底层维护了一个双向链表
 * 2. LinkedList中维护了两个属性first和last，分别指向首节点和尾结点。
 * 3. 每个节点（Node对象），里面又维护了prev，next，item三个属性，其中通过prev指向前一个，通过next指向后一个，最终实现双向链表。
 * 4. 所以LinkedList的元素的添加和删除，不是通过数组完成的，相对来说效率较高。
 * <p>
 * LinkedList的增删改查（CRUD）
 * 1. add()
 * 2. remove()
 * 3. set()
 * 5. get()
 * <p>
 * ArrayList和LinkedList的比较：
 * ArrayList    可变数组    增删的效率较低（数组扩容）   改查的效率较高
 * LinkedList   双向链表    较高，通过链表追加          较低
 * <p>
 * 1. 如果我们查改的操作比较多，用ArrayList。
 * 2. 如果增删的操作比较多，用LinkedList。
 * 3. 一般来说，在程序中，80%到90%都是查询，因此大部分情况下会选择ArrayList。
 * 4. 在一个项目中，根据业务灵活选择，也可能这样，一个模块使用的是ArrayList，另一个模块是LinkedList。因此需要根据模块需求选择
 * 5. 两种方法都是现成不安全，因此建议只在单线程程序中使用
 *
 * <p>Date: 2022-06-05  16:30 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    链表的add方法底层：
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
 */

/*
    remove()方法底层源代码：
    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--; //链表长度
        modCount++; //操作该链表次数
        return element;
    }
 */

public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        objects.add(1);
        objects.add(1);
        objects.add(1);
        objects.add(2, 188);
        System.out.println(objects); //[1, 1, 188, 1]

        for (int i = 0; i <= 10; i++) {
            objects.add(i);
        }
        System.out.println(objects); //[1, 1, 188, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//        删除remove(),默认删除的是链表的第一个位置的元素，返回该删除的元素值
        objects.remove();
        System.out.println(objects); //[1, 188, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        指定删除位置
        objects.remove(2); //删掉了1
        System.out.println(objects);//[1, 188, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//        修改某个节点的对象
        objects.set(1, 999);
        System.out.println(objects); //[1, 999, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//        获取
        System.out.println(objects.get(3));
        System.out.println(objects.getFirst());
        System.out.println(objects.getLast());

//        增强for遍历
        for (Object o : objects) {
            System.out.println(o);
        }

//        迭代器遍历
        Iterator objectIterator = objects.iterator();
        while (objectIterator.hasNext()) {
            Object next = objectIterator.next();
            System.out.println(next);
        }

    }
}

