package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: HashSetExercise2 </p>
 * <p>Description: HashSet课后练习2 </p>
 * <p>Date: 2022-06-07  21:01 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class HashSetExercise2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        Employee1 jack = new Employee1("jack", new MyDate("1997", "01", "29"));
        Employee1 tom = new Employee1("tom", new MyDate("1997", "01", "29"));
        Employee1 jack1 = new Employee1("jack", new MyDate("1997", "01", "29"));
        set.add(jack);
        set.add(jack1);
        set.add(tom);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}

class MyDate {
    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

class Employee1 {
    private String name;
    private MyDate birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    public Employee1(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}