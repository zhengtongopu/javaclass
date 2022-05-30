package poly.polyarray;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: PolyArray </p>
 * <p>Description: 多态数组 </p>
 * <p>Date: 2022-05-23  22:09 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class PolyArray {
    public static void main(String[] args) {
//        现有一个继承结构如下，要求创建一个person对象
//        2个sutdent对象和2个teacher对象，同意放在数组中，并调用每个对象的say方法
        Person[] person = new Person[5];
        person[0] = new Person("jack", 20);
        person[1] = new Student("smith", 18, 100);
        person[2] = new Student("rolin", 17, 80);
        person[3] = new Teacher("scott", 30, 20000);
        person[4] = new Teacher("king", 50, 25000);
        for (int i = 0; i < person.length; i++) {
            String str = person[i].say(); //动态绑定机制 逐个调用各个类中各自的say方法
            System.out.println(str);
            if (i == 1 || i == 2) {
                ((Student) person[i]).student();
            } else if (i == 3 || i == 4) {
                ((Teacher) person[i]).teacher();
            }
        }

//        想要调用各个子类中的特有方法，则向下转型
    }
}