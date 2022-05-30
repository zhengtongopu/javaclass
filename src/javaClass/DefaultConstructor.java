package javaClass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: DefaultConstructor </p>
 * <p>Description: 构造器 </p>
 * <p>Date: 2022/05/19/20:19 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class DefaultConstructor {
    int age;
    String name;

    public DefaultConstructor() {
        this(10, "101"); //构造器内调用构造器，用此语句，但是必须放在第一条语句的位置
        System.out.println("构造器");
    }

    public DefaultConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //this可以访问本类的属性（全局变量，函数）
    public void f1() {
        String name = "111";
        System.out.println("name" + this.name); // 使用this.name，则输出101
        System.out.println("name" + name); //不使用this.name，则输出函数内的局部变量name=111
        this.f2();
    }

    public void f2(){
        System.out.println("f2");
    }
}