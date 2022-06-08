package collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: HashTable </p>
 * <p>Description: Hashtable类 </p>
 * <p>
 * 基本说明：
 * 1. 存放的元素是键值对：K-V；
 * 2. hashtable的键和值都不能为null，否则会抛出空指针异常
 * 3. hashtable使用方法基本上和hashmap一致；
 * 4. hashtable是线程安全的，hashmap是线程不安全的
 * <p>
 * 底层源码解析：
 * 1. hashtable底层有一个Entry类型的数组，初始化大小是11，临界值是8（initialCapacity[11] * loadFactor[0.75] = 8）
 * 2. hashtable底层的数组中保存的是一个Entry类型的链表
 * 3. 按照自己的扩容机制，即为2n + 1（跟hashmap略有不同）。比如说第一次扩容后，容量变为23
 *
 * <p>Date: 2022-06-08  20:33 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    底层扩容机制：

    protected void rehash() {
        int oldCapacity = table.length;
        Entry<?,?>[] oldMap = table;

        // overflow-conscious code
//        当超过临界值后，按照原来的基础上左移1位再加1 =>> 等同于原来的2倍+1
        int newCapacity = (oldCapacity << 1) + 1;
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            if (oldCapacity == MAX_ARRAY_SIZE)
                // Keep running with MAX_ARRAY_SIZE buckets
                return;
            newCapacity = MAX_ARRAY_SIZE;
        }
        Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];

        modCount++;
        threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
        table = newMap;

        for (int i = oldCapacity ; i-- > 0 ;) {
            for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
                Entry<K,V> e = old;
                old = old.next;

                int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                e.next = (Entry<K,V>)newMap[index];
                newMap[index] = e;
            }
        }
    }
 */

public class Hashtable_ {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(1, "jack");
        map.put(2, "tom");
        map.put(3, "yyf");
        map.put(4, "yyf");
        map.put(3, "zhou");
//        map.put(4, "yyf");
        System.out.println(map);
    }
}