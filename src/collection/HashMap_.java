package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: HashMap_ </p>
 * <p>Description: HashMap类 </p>
 *
 * 基本介绍：
 * 1. HashMap是Map接口使用频率最高的实现类。
 * 2. HashMap是以K-V对方式来存储数据
 * 3. key不可以重复，value可以重复。
 * 4. 如果添加相同的key，则会覆盖掉原来的key-val，等同于修改（key不变，val修改）
 * 5. 与HashSet一样，不保证映射的顺序，因为底层是以hash表的方式存储
 * 6. HashMap线程不安全，没有线程同步互斥。
 *
 * HashMap的扩容机制与HashSet完全一样
 * <p>Date: 2022-06-08  16:32 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class HashMap_ {
    public static void main(String[] args) {
//        HashMap扩容机制触发
        Map map = new HashMap();
        for (int i = 0; i < 12; i++) {
            map.put(new Test(i), "hello");
        }
    }
}
class Test {
    public int num;

    public Test(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}