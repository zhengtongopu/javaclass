package collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: TreeSet_ </p>
 * <p>Description: TreeSet类 </p>
 * <p>
 * 基本说明：
 * 1. TreeSet会自动排序，如果存放的对象不能排序则会报错，所以存放的对象必须指定排序规则。
 * 2. 排序规则包括自然排序和客户排序。
 * 3. 如果希望TreeSet能正常运转，只能添加同一种类型对象。
 * 4. 当把一个对象加入TreeSet集合时，TreeSet调用该对象的compareTo(Object obj)方法与容器中的其他对象比较大小，然后根据红黑树结构找到它的存储位置，※如果这两个对象通过compareTo(Object
 * obj)方法比较相等，新对象将无法添加到TreeSet集合中。（对于使用实现Comparator接口的构造器的对象，则看匿名内部类的方法的具体实现，如果相等，即返回值为0，则无法添加）
 * 5. TreeSet底层是一个TreeMap
 *
 *
 * <p>Date: 2022-06-08  21:22 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    客户自定义排序：
    1，调用带有实现Comparator接口的构造器
        public TreeSet(Comparator<? super E> comparator) {
            this(new TreeMap<>(comparator));
        }
    在调用treeSet.add()时，在底层会执行到
        private V put(K key, V value, boolean replaceOld) {
            Entry<K,V> t = root;
            if (t == null) {
                addEntryToEmptyMap(key, value);
                return null;
            }
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {
                do {
                    parent = t;
                    // 在这里调用构造器中实现的匿名内部类
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else {
                        V oldValue = t.value;
                        if (replaceOld || oldValue == null) {
                            t.value = value;
                        }
                        return oldValue;
                    }
                } while (t != null);
            } else {
                Objects.requireNonNull(key);
                @SuppressWarnings("unchecked")
                Comparable<? super K> k = (Comparable<? super K>) key;
                do {
                    parent = t;
                    cmp = k.compareTo(t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else {
                        V oldValue = t.value;
                        if (replaceOld || oldValue == null) {
                            t.value = value;
                        }
                        return oldValue;
                    }
                } while (t != null);
            }
            addEntry(key, value, parent, cmp < 0);
            return null;
        }

 */

public class TreeSet_ {
    public static void main(String[] args) {
//        调用无参构造器后添加元素时，自然排序调用自带的compareTo方法（String的compareTo方法，看源码）
        TreeSet treeSet = new TreeSet();
        treeSet.add("tom");
        treeSet.add("scott");
        treeSet.add("kky");
        treeSet.add("puppey");
        treeSet.add(Integer.toString(132));
        treeSet.add(Integer.toString(42));
        treeSet.add(Integer.toString(122));
        System.out.println(treeSet); //[122, 132, 42, kky, puppey, scott, tom]
//        客户自定义排序，使用带Comparator接口的构造器
        TreeSet treeSet1 = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                即，是否可以添加进treeSet中的条件，要看匿名内部类的方法的具体实现，如果按照规矩两者相等，即return返回0，则无法添加
//                return ((String) o2).compareTo((String) o1); //[tom, scott, puppey, kky, 42, 132, 122]
                return ((String) o2).length() - ((String) o1).length(); //[puppey, scott, tom, 42]
            }
        });
        treeSet1.add("tom");
        treeSet1.add("scott");
        treeSet1.add("kky");
        treeSet1.add("puppey");
        treeSet1.add(Integer.toString(132));
        treeSet1.add(Integer.toString(42));
        treeSet1.add(Integer.toString(122));
        System.out.println(treeSet1); //[tom, scott, puppey, kky, 42, 132, 122]
    }
}