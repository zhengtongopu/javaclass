package static_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ChildGame </p>
 * <p>Description: 类变量和类方法 （静态变量和静态方法） </p>
 * <p>Date: 2022-05-25  14:24 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/**
 * 调用静态方法和静态变量  类名.静态变量名/静态方法名
 * 静态变量静态方法在类加载的时候生成，即使没有创建对象实例也可以访问。（注意，静态变量静态方法的访问依然要遵守相关的访问权限，只有在public的前提下，其他类调用静态方法或静态变量时才可以使用“类名.变量名”这样的声明方法）
 * 静态变量的生命周期随着类加载开始，随着类消亡而消亡
 *
 * 类方法的使用场景：当方法内不涉及任何和对象相关的成员时，可以把方法定义为静态方法，提高工作效率
 * （例如工具类的方法Utils，还有Math类，Array类，Collections类）
 *
 * 静态方法/静态变量 细节：
 * <1>类方法和普通方法都是随着类的加载而加载，将结构信息储存在方法区中(类方法中无this参数，普通方法中默认隐含着this参数)
 * <2>类方法中不可以使用this或super关键字
 * <3>类方法中只能访问静态变量和静态方法（普通方法静态或者非静态的都可以访问）
 * <4>类方法可以被继承，不能被重写
 */


public class ChildGame {

    public static void main(String[] args) {

//
        System.out.println(Person.total);

    }
}

class Person {
    private int id;
    private String name;
    //    static 静态变量
    public static int total = 0;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotal() {
        return total;
    }

//      静态方法

    public static void setTotal(int total) {
        Person.total = total;
//        静态方法中只能调用静态变量和静态方法
//        setName(); ERROR
    }


}