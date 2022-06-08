package collection;

import java.util.*;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Map_ </p>
 * <p>Description: Map接口实现类 </p>
 * <p>
 * 基本介绍：
 * 1. Map与Collection并列存在，用于保存具有映射关系的数据：Key-Value（双列元素）；
 * 2. Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象中
 * 3. Map中的key不允许重复，原因和HashSet一样（源码也和HashSet一样）(相同key值的元素在存储时，后保存的值会替换先保存的值)
 * 4. Map中存放的value可以重复
 * 5. Map中的key可以为null，value也可以为null，但是key中的null只能存在一个，value中null可以存在多个
 * 6. 常用String类作为Map的key
 * 7. key和value之间存在单向一对一的关系，即通过指定的key总能找到对应的value
 * 8. 同set一样，map中存储的K-V键值对同样是无序的
 * <p>
 * 常用方法： 见下方
 * <p>
 * Map遍历方法（六种）
 * 1. containskey：查找键是否存在
 * 2. keySet：获取所有的键
 * 3. entrySet：获取所有的关系k-v
 * 4. values：获取所有的值
 * <p>Date: 2022-06-08  08:50 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    1. k-v最后是 HashMap$Node node = newNode(hash, key, value, null)
    2. k-v为了方便程序员遍历，还会创建EntrySet集合，该集合存放的元素的类型是Entry，而一个Entry对象，就包含了Key和Value —— EntrySet<Entry<K,V>>,
        即transient Set<Map.Entry<K,V>> entrySet;
    3. entrySet中，定义的类型是Map.Entry，但实际上实现的还是HashMap$Node（Node静态内部类实现了Entry接口）
    4. 当吧HashMap$Node 对象存放到entrySet中，就方便我们遍历，因为Map.Entry提供了两个 的重要方法，即getKey() 和 getValue()
 */

/*
    put() 增
    get()   根据键取值
    isEmpty() 判断个数是否为0
    size() 获取元素个数
    remove() 根据键删除
    clear() 清空
    containsKey() 查找键是否存在

 */

/*
    六种遍历方法：
    1、 先取出所有的key，然后通过key获取对应的value
        1. 然后用增强for或者迭代器循环取出

        Set keyset = map.keySet();
        for (Object o : keyset) {
            System.out.println(o + "-" + map.get(o));
        }
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next(); //返回的是key的值
            System.out.println(next + "=" + map.get(next));
        }

    2. 取出所有value
        1. 使用values方法然后循环取出（增强for或者迭代器）

        Collection values1 = map.values();
        for (Object obj : values1) {
            System.out.println(obj);
        }

        Iterator iterator1 = values1.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

    3. 通过entrySet来获取key-value
        1. 然后通过增强for或者迭代器取出
        2. 注意向下转型 Map.Entry me = (Map.Entry) obj;

        Set set2 = map.entrySet();
        for (Object obj : set2) {
            Map.Entry me = (Map.Entry) obj;
            System.out.println(me.getValue() + " " + me.getKey());
        }
        Iterator iterator3 = set2.iterator();
        while (iterator3.hasNext()) {
            Map.Entry next = (Map.Entry)iterator3.next();
            System.out.println(next.getValue() + " " + next.getKey());
        }
 */

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "jack");
        map.put(2, "tom");
        map.put(3, "yyf");
        map.put(3, "zhou");
        map.put(4, "yyf");
        System.out.println(map); //{1=jack, 2=tom, 3=zhou, 4=yyf}
        Set set = map.keySet();
        System.out.println(set); //[1, 2, 3, 4]
        Collection values = map.values();
        System.out.println(values); //[jack, tom, zhou, yyf]


        Set keyset = map.keySet();
        for (Object o : keyset) {
            System.out.println(o + "-" + map.get(o));
        }
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next(); //返回的是key的值
            System.out.println(next + "=" + map.get(next));
        }

        Collection values1 = map.values();
        for (Object obj : values1) {
            System.out.println(obj);
        }

        Iterator iterator1 = values1.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }


        Set set2 = map.entrySet();
        for (Object obj : set2) {
            Map.Entry me = (Map.Entry) obj;
            System.out.println(me.getValue() + " " + me.getKey());
        }
        Iterator iterator3 = set2.iterator();
        while (iterator3.hasNext()) {
            Map.Entry next = (Map.Entry) iterator3.next();
            System.out.println(next.getValue() + " " + next.getKey());
        }
    }
}