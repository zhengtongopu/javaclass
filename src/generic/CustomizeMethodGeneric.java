package generic;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: CustomizeMethodGeneric </p>
 * <p>Description: 自定义泛型方法 </p>
 * <p>
 * 基本语法：见下方
 * <p>
 * 注意细节：
 * 1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
 * 2. 当泛型方法被调用时，类型会确定
 * 3. public void eat(E e) {},修饰符后没有< T, R...>,因此eat方法不是泛型方法，只是使用了泛型
 * <p>Date: 2022-06-09  21:32 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    修饰符 <T, R...> 返回方法 方法名（参数列表） {
    }
 */

public class CustomizeMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
//        当我们调用方法是，传入参数，编译器就会自动确认类型
        car.fly("宝马", 100);
//        再次调用时也会再次重新判断类型
        car.fly(199, "宝马");
    }
}

class Car {
    //    普通方法
    public void run() {
    }

    //    泛型方法
//    1. <T, R>就是泛型，要跟在修饰符后面
    public <T, R> void fly(T t, R r) {
    }
}

//泛型方法也可以写在泛型类中
class Car1<T, R> {
//    ※泛型方法即可以使用类中定义的泛型，也可以使用自己定义的泛型
    public <K, V> void fly(T t, K k, V v) {
    }
//    非泛型方法只能使用类中已经定义的泛型
//    public void eat(M m) {} //error
}