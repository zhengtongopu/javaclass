package collection;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: HashSetExercise </p>
 * <p>Description: HashSet的最佳应用 </p>
 * <p>Date: 2022-06-07  20:17 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    记住这两个重写·hashcode方法和equals方法的模板
    hashset内添加类对象时，可以通过重写这两个方法来控制可添加的选项

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emoloyee emoloyee = (Emoloyee) o;
        return age == emoloyee.age && Objects.equals(name, emoloyee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

 */

public class HashSetExercise {
    public static void main(String[] args) {
        Set set = new HashSet();
        Employee emoloyee = new Employee("jack", 20);
        Employee emoloyee1 = new Employee("tom", 21);
        Employee emoloyee2 = new Employee("jack", 20);
        Employee emoloyee3 = new Employee("jack", 21);
        set.add(emoloyee);
        set.add(emoloyee1);
        set.add(emoloyee2);
        set.add(emoloyee3);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee next =  (Employee) iterator.next();
            System.out.println(next);

        }

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
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

//    @Override
//    public boolean equals(Object obj) {
//        Emoloyee e = (Emoloyee) obj;
//        if (this == obj) {
//            return true;
//        }
//        if (e == null || getClass() != e.getClass()) {
//            return false;
//        }
//        if (this.age == e.getAge() && this.name.equals(e.getName())) {
//            return true;
//        }
//        return false;
//    }

//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}