package collection;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Conclusion </p>
 * <p>Description: 总结集合 </p>
 *
 * ※开发中如何选择集合实现类，见下方！！！
 * <p>Date: 2022-06-08  21:04 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    ※开发中如何选择集合实现类※
    1. 先判断储存的类型（一组对象（单列）或是一组键值对（双列））
    2. 一组对象：Collection接口
        （1）允许重复： List
            增删多： LinkedList(底层维护了一个双向列表)
            改查多： ArrayList（底层维护了Object类型的可变数组）
        （2）不允许重复： Set
            无序： HashSet（底层是HashMap，维护了一个哈希表，即数组+链表+红黑树）
            排序： TreeSet
            插入和取出顺序一致： LinkedHashSet（维护数组+双向链表）
    3. 一组键值对：Map接口
        （1）键无序： HashMap（底层是哈希表，数组+链表+红黑树）
        （2）键排序： TreeMap
        （3）键插入和取出顺序一致： LinkedHashMap
        （4）读取文件： Properties
 */


public class Conclusion {
}