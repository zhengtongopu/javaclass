package homework.homework06;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework06 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-24  20:34 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework06 {

    public Person[] sort(Person[] p) {
        for (int i = 1; i < p.length; i++) {
            for (int j = 0; j < p.length - i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    Person temp = p[j + 1];
                    p[j + 1] = p[j];
                    p[j] = temp;
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        /**
         * 定义一个Person数组，要求按照年龄大小排序
         */
        Person[] person = new Person[3];
        person[0] = new Person("jack", 10);
        person[1] = new Person("tom", 50);
        person[2] = new Person("scott", 20);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Homework06 hm = new Homework06();
        hm.sort(person);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}