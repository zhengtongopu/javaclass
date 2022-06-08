package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework12 </p>
 * <p>Description: 集合类课后练习3 </p>
 * <p>Date: 2022-06-09  11:11 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework12 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);
        System.out.println(map);
        map.put("jack", 2600);
        Set set = map.keySet();
        for (Object o : set) {
            map.put(o, (Integer) (map.get(o)) + 100);
        }
//        EntrySet
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry) iterator.next();
            map.put(next.getKey(), (Integer) next.getValue() + 100);
        }
        System.out.println(map);
        for (Object o : set) {
            System.out.println(o);
            System.out.println(map.get(o));
        }

    }
}

