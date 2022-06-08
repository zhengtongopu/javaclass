package collection;

import java.util.Vector;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Vector_ </p>
 * <p>Description: Vector类 </p>
 * <p>
 * 细节：
 * 1. Vector底层也是一个对象数组:protected Object[] elementData;
 * 2. Vector是线程同步的，即线程安全，Vector类中的方法带有synchronized关键字
 * 3. 在开发过程中，需要线程同步安全的时候，使用Vector
 * <p>
 * Vector类的扩容机制：
 * 1. 如果调用的是无参构造器，默认长度为10，满后，按2倍扩容。
 * 2. 如果是调用指定大小的有参构造器，则每次直接按2倍扩容。
 *
 * <p>Date: 2022-06-04  20:27 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    调用无参构造器源码：

    public Vector() {
        this(10);
    }

    public Vector(int initialCapacity) {
        this(initialCapacity, 0);
    }

    public Vector(int initialCapacity, int capacityIncrement) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        this.elementData = new Object[initialCapacity];
        this.capacityIncrement = capacityIncrement;
    }

    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = ArraysSupport.newLength(oldCapacity,
                minCapacity - oldCapacity,
                capacityIncrement > 0 ? capacityIncrement : oldCapacity);
        return elementData = Arrays.copyOf(elementData, newCapacity);
    }
 */

public class Vector_ {
    public static void main(String[] args) {
        Vector<Object> objects = new Vector<>();
        objects.add("jack");
        objects.add(null);
        objects.add("jack");
        objects.add(null);
        objects.add("ee");
        objects.add(null);
        objects.add(null);
        System.out.println(objects);

        for (int i = 1; i <= 10; i++) {
            objects.add(i);
        }

        Vector<Object> objects1 = new Vector<>(3);
        objects1.add("jack");
        objects1.add(null);
        objects1.add("jack");
        for (int i = 1; i <= 10; i++) {
            objects1.add(i);
        }
    }
}