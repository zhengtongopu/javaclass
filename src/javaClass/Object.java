package javaClass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Object </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/27/21:32 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Object {
    public static void main(String[] args) {
        //创建一个名为cat1的猫对象
        Cat cat1 = new Cat();
        cat1.catName = "xiaobai";
        cat1.age = 3;
        cat1.color = "white";
        //访问对象的属性
        System.out.println("第一只猫的信息" + cat1.catName + " "
                + cat1.age + " " + cat1.color);
        //方法调用
        cat1.method();
        int[] array = {1, 3, 4, 2};
//        cat1.method01(array);
        int[] getarray = new int[array.length];
        getarray = cat1.method01(array);
        for (int i = 0; i < getarray.length; i++){
            System.out.print(getarray[i]);
        }

        //方法调用细节
        //1. 同一个类中的方法可以直接调用，例: function();
        //2. 跨类的方法调用，需要先new一个对象，再调用方法，例：Cat cat1 = new Cat(); cat1.function();
    }
}

class Cat {
    String catName;
    int age;
    String color;

    //访问修饰符
    //public
    //protected
    //默认(修饰符最好都写)
    //private
    //方法/函数
    public void method(){
        System.out.println("kk");
    }
    //一个方法最多有一个返回值，如果要返回多个数值，建议使用数组/对象
    //方法定义时的菜蔬成为形参，方法调入时传入的参数为实参
    //方法内不能定义方法
    public int[] method01(int array[]){
        int[] n1 = new int[array.length];
        for (int i = 0; i < array.length; i++){
            n1[i] = array[i];
        }
        return n1;
    }
}