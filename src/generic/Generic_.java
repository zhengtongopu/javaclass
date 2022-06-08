package generic;

import java.util.ArrayList;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Generic_ </p>
 * <p>Description: 泛型 </p>
 * <p>
 * 基本介绍：
 * 1. 泛型又称参数化类型，是JDK5出现的新类型，解决数据类型的安全性问题
 * 2. 在类声明或者实例化时只要制定好需要的具体的类型即可
 * 3. Java泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常。同事，代码可以更加简洁和健壮。
 * 4. 泛型的作用是：可以在类声明时通过一个标识标识类中某个属性的类型，或是某个方法的返回值的类型，或是参数类型。
 *
 * 泛型的声明：见下方
 *
 * 使用细节及注意事项：
 * 1. 泛型使用的T,V,E等只能是引用类型，因此不能使用基本数据类型。
 * 2. 在指定泛型的具体类型后，可以传入该类型或者其子类类型。
 * 3. 如果不指定泛型的具体类型，则默认给泛型带入的是Object类型
 *
 * <p>Date: 2022-06-09  14:13 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    interface<T>或者是class<K,V>
    1. T,K,V不代表值，而是表示类型
    2. 任意字母都可以，常用T表示，是type的缩写
    3. 在实例化时指定类型
 */

public class Generic_ {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("123456");
        for (String str : strings) {
            System.out.println(str);
        }

    }
}

//类声明时通过一个标识表示类中的某个属性的类型。（常用E,T,K,V）
class Person<E> {
    private E s;
//或者表示参数类型
    public Person(E s) {
        this.s = s;
    }
//或者表示返回类型
    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }
}