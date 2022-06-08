package collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: TreeMap_ </p>
 * <p>Description: TreeMap类 </p>
 *
 * 基本与TreeSet相同，因为TreeSet的底层就是一个TreeMap
 *
 * 排序时是看key的compareTo()方法，因此key的数据类型必须重写或者继承了compareTo()方法
 * <p>Date: 2022-06-08  21:50 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        objectObjectTreeMap.put("tom", "汤姆");
        objectObjectTreeMap.put("scott", "斯科特");
        objectObjectTreeMap.put("john", "约翰");
        objectObjectTreeMap.put("lucy", "露西");
        System.out.println(objectObjectTreeMap); //{tom=汤姆, john=露西, scott=斯科特}
        /*
        底层加入时判断的源代码
        Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {
                parent = t;
                //根据匿名内部类的规则，john和lucy字符串长度相等，因此cmp返回为0
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {
                    V oldValue = t.value; // oldValue = 约翰
                    if (replaceOld || oldValue == null) {
                        t.value = value; //t.value = 露西，即露西代替了约翰，但是键值并没有更换还是john
                    }
                    return oldValue;
                }
            } while (t != null);
         */

    }
}