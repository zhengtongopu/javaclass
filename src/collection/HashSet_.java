package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: HashSet_ </p>
 * <p>Description: HashSet类 </p>
 * <p>
 * 基本说明：
 * 1. 实现了Set接口
 * 2. HashSet底层实际上是HashMap
 * 3. 可以存放null，但只能有一个null
 * 4. HashSet不保证元素是有序的，取决于hash后，在确定索引的结果（即不保证存放元素的顺序一致）
 * 5. 不能有重复的元素或对象
 * <p>
 * HashSet底层机制说明：底层本质是HashMap（HashMap底层是数组+链表+红黑树）
 * 1. HashSet底层是一个HashMap。
 * 2. 添加一个元素时，先得到hash值，这个值会转换成索引值
 * 3. 找到存储数据表table，看这个索引位置是否已经有存放的元素
 * 4. 如果没有，则直接加入。
 * 5. 如果有，调用equals比较（该equals可能会根据不同的类的需求而被重写，比如string），如果相同，就放弃添加，如果不相同，就添加到该索引链表的最后。
 * 6. 在Java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD（默认是8），并且table的大小（即数组长度大小为64） >= MIN_TREEIFY_CAPACITY（默认64），就会进行树化（红黑树）
 * <p>
 * 模拟一个简单的数组+链表的组合结构（HashMap）,源码如下。
 * 即数组中的每个元素存储一个链表（这种结构称为表），为了提高存储效率，当每个元素中存储的链表长度达到一定长度，系统会自动将链表优化成一个红黑树的结构，进一步提高存储效率
 * <p>
 * HashSet底层扩容机制：
 * 1. HashSet底层是HashMap，第一次添加时，table数组扩容到16，临界值（threshold = 16）*加载因子（loadFactor = 0.75）= 12。
 * 2. 如果table数组使用到了临界值12，就会扩容到16 * 2 = 32，新的临界值就是32 * 0.75 = 24，以此类推。
 * 3. 在Java8中，如果一条链表的元素个数到达TREELFY_THRESHOLD（默认是8），并且table的大小 >= MIN_TREELFY_CAPACITY(默认64)， 就会进行树化（红黑树），否则仍然采用数组扩容机制。
 *
 * <p>Date: 2022-06-06  22:40 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    HashSet的无参构造器，所以说HashSet的底层实际上是HashMap
    public HashSet() {
        map = new HashMap<>();
    }
 */

/*
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
 */

public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("jack"));
        set.add(new Dog("jack"));
        System.out.println(set); //[Dog{name='jack'}, Dog{name='jack'}, lucy]

//        ※※※※注意：即使new String，相同字符串对应的对象也只能加进去一个
        set.add(new String("zheng"));
        set.add(new String("zheng"));
        System.out.println(set);//[Dog{name='jack'}, zheng, Dog{name='jack'}, lucy]

//        模拟一个简单的数组+链表的组合结构（HashMap）
//        1. 创建一个数组，数组元素类型是Node
//        2. Node的数组被称为表
        SingleNode[] table = new SingleNode[16];
        System.out.println(table);
//        3. 创建Node节点john
        SingleNode john = new SingleNode("john", null);
        table[2] = john;
        System.out.println(table);
//        4. 创建一个新的节点，并将新的节点挂载到john
        SingleNode jack = new SingleNode("jack", null);
        john.next = jack;
        System.out.println(table);
        SingleNode rose = new SingleNode("rose", null);
        jack.next = rose;
        System.out.println(table);
//        5. 重复上述操作，可形成数组+链表的结构

        Set set1 = new HashSet();
        for (int i = 0; i <= 64; i++) {
            set1.add(new Dog());
        }
        for (int i = 0; i <= 7; i++) {
            set1.add(new Cat());
        }
    }
}

class Cat {

}

class Dog {
    public String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

class SingleNode {
    public Object item;
    public SingleNode next;

    public SingleNode(Object item, SingleNode next) {
        this.item = item;
        this.next = next;
    }
}