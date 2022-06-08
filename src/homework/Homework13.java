package homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework13 </p>
 * <p>Description: 集合类课后练习6 </p>
 * <p>Date: 2022-06-09  12:59 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework13 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Person jack = new Person("jack", 1001);
        Person tom = new Person("tom", 1002);
        set.add(jack);
        set.add(tom);
        jack.name = "scott";
        set.remove(jack);
        System.out.println(set); //[Person{name='scott', id=1001}, Person{name='tom', id=1002}]
        set.add(new Person("scott", 1001));
        System.out.println(set); //[Person{name='scott', id=1001}, Person{name='tom', id=1002}, Person{name='scott', id=1001}]
        set.add(new Person("jack", 1001));
        System.out.println(set); //[Person{name='scott', id=1001}, Person{name='jack', id=1001}, Person{name='tom', id=1002}, Person{name='scott', id=1001}]
    }
}

class Person {
    public String name;
    public int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}