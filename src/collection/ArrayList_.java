package collection;

import java.util.ArrayList;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArrayList_ </p>
 * <p>Description: ArrayList类 </p>
 * <p>
 * ArrayList类的细节：
 * 1. 可以放任何元素，即使是null
 * 2. ArrayList是由数组来实现数据存储的.
 * 3. ArrayList基本等同于Vector，除了ArrayList是线程不安全的，但是ArrayList的效率较高，因此在多线程的情况下，不建议使用ArrayList
 * <p>
 * ArrayList的底层操作机制：（带源码分析在下方）
 * 1. ArrayList类中维护了一个Object类型的数组elementData: transient Object[] elementData;（transient关键字：表示瞬间，短暂的，说明该属性不会被序列化）
 * 2. 当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第一次添加，则扩容elementData为10，如果需要再次添加，则扩容elementData为1.5倍。
 * 3. 如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData为1.5倍。
 * <p>Date: 2022-06-04  17:17 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    细节2：调用无参构造器后扩容之源码分析 第一次添加元素
    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = e;
        size = s + 1;
    }

    private Object[] grow() {
        return grow(size + 1); //grow(0 + 1)
    }

    private Object[]grow(int minCapacity){ // 第一次添加元素：minCapacity = 1；第一次扩容：minCapacity = 11
        int oldCapacity=elementData.length; // 第一次添加元素：oldCapacity = 0；第一次扩容：oldCapacity = 10
        if(oldCapacity>0||elementData!=DEFAULTCAPACITY_EMPTY_ELEMENTDATA){ //第一次添加元素：条件判断为false；第一次扩容：true
            int newCapacity=ArraysSupport.newLength(oldCapacity, // 10
            minCapacity-oldCapacity, // 1
            oldCapacity>>1); // 位运算右移等同于除以2，因此这里等于5，
            return elementData=Arrays.copyOf(elementData,newCapacity);//第一次扩容：newCapacity = 15，使用copyOf方法赋值原来的数组到新的数组中
        }else{
            return elementData=new Object[Math.max(DEFAULT_CAPACITY,minCapacity)]; //第一次添加元素：返回new Object[10]
        }
    }

    public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
        // preconditions not checked because of inlining
        // assert oldLength >= 0
        // assert minGrowth > 0

        int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
        if (0 < prefLength && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
            return prefLength;
        } else {
            // put code cold in a separate method
            return hugeLength(oldLength, minGrowth);
        }
    }

 */
/*

 */

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add(null);
        objects.add("jack");
        objects.add(null);
        objects.add("ee");
        objects.add(null);
        objects.add(null);
        System.out.println(objects);


        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        arrayList.add(100);
        arrayList.add(200);

    }
}