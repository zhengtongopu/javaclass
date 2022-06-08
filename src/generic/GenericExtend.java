package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: GenericExtend </p>
 * <p>Description: 泛型的继承和通配符 </p>
 *
 * 1. 泛型不具备继承性，不允许 List< Object > list = new ArrayList< String >()
 * 2. < ? >: 支持任意泛型类型
 * 3. < ? extends A >: 支持A类以及A类的子类，规定了泛型的上限
 * 4. < ? super A >: 支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
 * <p>Date: 2022-06-09  21:51 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class GenericExtend {
    public static void main(String[] args) {
        Object o = new String(); // OK
//        List<Object> list = new ArrayList<String>(); //ERROR

//        通配符
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<AA> aas = new ArrayList<>();
        ArrayList<BB> bbs = new ArrayList<>();
        ArrayList<CC> ccs = new ArrayList<>();

//        <?>: 支持任意类型的泛型传入，因此是可行的
        printCollection1(objects);
        printCollection1(strings);
        printCollection1(aas);
        printCollection1(bbs);
        printCollection1(ccs);

//        <? extends AA>: 只支持AA及AA的子类类型的泛型传入
//        printCollection2(objects); //ERROR Object类是AA的父类
//        printCollection2(strings); //ERROR String与AA类无关
        printCollection2(aas);
        printCollection2(bbs);
        printCollection2(ccs);

//        <? super AA>: 只支持AA类及AA类的父类类型的泛型传入
        printCollection3(objects);
//        printCollection3(strings); //ERROR 与AA类无关
        printCollection3(aas);
//        printCollection3(bbs); //ERROR 是AA类的子类
//        printCollection3(ccs); //ERROR 是AA类的子类

    }

    public static void printCollection1(List<?> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }

    public static void printCollection2(List<? extends AA> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }

    public static void printCollection3(List<? super AA> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }
}

class AA{

}

class BB extends AA{

}

class CC extends BB{

}