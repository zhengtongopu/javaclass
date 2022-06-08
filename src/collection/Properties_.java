package collection;

import java.util.Properties;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Properties_ </p>
 * <p>Description: Properties类 </p>
 *
 * 基本介绍：
 * 1. Properties类继承自Hashtable类并且实现了Map接口，也是使用一种键值对的形式保存数据。
 * 2. 他的使用特点与Hashtable相似。
 * 3. Properties还可以用于从xxx.properties文件中，加载数据到Properties类对象，并进行读取和修改
 * 4. 说明：xxx.properties文件通常作为配置文件，这个知识点在IO流举例。比如说保存操作数据库的密码等配置信息
 * <p>Date: 2022-06-08  20:49 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        增加
        properties.put("john", 90);
        properties.put("jack", 100);
        properties.put("tom", 12);
//        properties.put(null, 100); //.NullPointerException
//        properties.put("kk", null); //.NullPointerException
        properties.put("scott", 89);
        properties.put("lucy", 80);

//        获取
        System.out.println(properties.get("tom"));
//        删除
        System.out.println(properties.remove("tom"));
//        修改
        properties.put("john", 100);
        System.out.println(properties);
    }
}