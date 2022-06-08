package collection;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: DoublyLinkedList </p>
 * <p>Description: 实现双向链表 </p>
 * <p>Date: 2022-06-05  17:07 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class DoublyLinkedList {
    public static void main(String[] args) {
//        实现一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node scott = new Node("scott");

        jack.next = tom;
        tom.next = scott;
        tom.prev = jack;
        scott.prev = tom;
        Node first = jack;
        Node last = scott;

//        演示从头到尾进行遍历
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        /*
        Node{item=jack}
        Node{item=tom}
        Node{item=scott}
         */

//        从尾到头的遍历
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.prev;
        }
        /*
        Node{item=scott}
        Node{item=tom}
        Node{item=jack}
         */

//        重新遍历需要重置first和last
        first = jack;
        last = scott;
//        加入新节点顺序(加在tom和scott之间)
//        1. 创建新的节点对象
        Node zheng = new Node("zheng");
//        2. 将新节点的next指向后一个节点，让prev指向前一个节点
        zheng.prev = tom;
        zheng.next = scott;
//        3. 修改tom的next和scott的prev
        tom.next = zheng;
        scott.prev = zheng;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        /*
        Node{item=jack}
        Node{item=tom}
        Node{item=zheng}
        Node{item=scott}
         */

    }
}

class Node {
    public Object item;
    public Node next;
    public Node prev;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}