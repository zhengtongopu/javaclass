package generic;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: CustomizeGeneric </p>
 * <p>Description: 自定义泛型类或接口 </p>
 *
 * 基本语法： 见下方
 *
 * 注意细节：
 * 1. 普通成员可以使用泛型（属性，方法）
 * 2. 使用泛型的数组，不能初始化
 * 3. 静态方法中不能使用类的泛型
 * 4. 泛型类的类型，实在创建对象时确定（因为创建对象时，需要制定确定类型）
 * 5. 泛型接口的类型，在继承接口或者实现接口时确定
 * 6. 如果在创建对象时，没有指定类型，默认Object
 * <p>Date: 2022-06-09  21:03 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    自定义泛型类的基本语法（也可以是接口）
    class 类名<T,R...> {
        成员
    }
    interface<T,R...> {
        抽象类;
    }
 */

public class CustomizeGeneric {
    public static void main(String[] args) {
        Tiger<String, Double, Integer> stringDoubleIntegerTiger = new Tiger<>(13.3, 13, "13");
    }
}

/*
    1. Tiger后面泛型，所以把Tiger就自定义为泛型类
    2. T,R,M为泛型标识符，一般是单个大写字母
    3. 泛型标识符可以有多个
    4. 普通成员可以使用泛型（属性，方法）
 */

class Tiger<T, R, M> {
    R r;
    M m;
    T t;
//    泛型数组无法初始化
//    T[] ts = new T[9]; //ERROR
    static {
//        静态方法，代码块内都不允许使用泛型
//    因为静态是和类相关的，在类加载时，对象还没有创建
//    所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
//        T t; //ERROR
    }

    public Tiger(R r, M m, T t) {
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

interface Test<E, T, V> {
    E getE(T t, V v);
    void setE(E e);
}

//接口继承时指定泛型类型
interface TestA extends Test<String, Double, Integer> {

}
//再实现时则自动填充泛型类型
class TestInterface02 implements TestA {
    @Override
    public String getE(Double aDouble, Integer integer) {
        return null;
    }

    @Override
    public void setE(String s) {

    }
}

//实现接口时指定泛型类型
class TestInterface implements Test<String, Double, Integer> {
    @Override
    public String getE(Double d, Integer i) {
        return null;
    }

    @Override
    public void setE(String s) {

    }

}

