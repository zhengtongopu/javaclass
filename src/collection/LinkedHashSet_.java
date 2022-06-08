package collection;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: LinkedHashSet_ </p>
 * <p>Description: LinkedHashSet类 </p>
 * <p>
 * 基础说明：
 * 1. LinkedHashSet是HashSet的子类
 * 2. LinkedHashSet底层是一个LinkedHashMap， 底层维护了一个数组+双向链表
 * 3. LinkedHashSet根据元素的hashCode值来决定元素的存储位置，同时使用链表维护元素的次序，使得元素看起来是以插入顺序保存的。
 * 4. LinkedHashSet不允许添加重复元素
 * <p>
 * 添加的底层机制：
 * 1. 在LinkedHashSet中维护了一个hash表和双向链表（LinkedHashSet有head和tail）。
 * 2. 每一个节点有before和after属性，这样可以形成双向链表。
 * 3. 在添加一个元素时，先求hash值，并通过hash值取得索引值，确定该元素在hashtable的位置，如此位置不存在任何元素，则将添加的元素加入到双向链表中。
 * 4. 如果已经有元素存在，则判断顺序与HashSet类一致（先看hash值，再调用equals方法）
 * 5. 数组是HashMap$Node[], 存放的元素/数据是LinkedHash$Entry类型（说明Entry类继承了Node类）
 * 细节：
 * 1. 添加第一次时，直接将数组table扩容到16，存放的节点类型是LinkedHashMap$Entry(静态内部类)
 * <p>Date: 2022-06-07  21:31 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("bmw", 200000));
        linkedHashSet.add(new Car("bmw", 200000));
        linkedHashSet.add(new Car("bmw", 500000));
        System.out.println(linkedHashSet);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}