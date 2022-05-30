package javaClass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Person </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/19/20:56 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("", 0);
    }
    
    public boolean compareTo(Person p) {
        return this.name.equals(p.name) && this.age == p.age;
    }

    public static void main(String[] args) {
        Person p2 = new Person("mary", 10);
        Person p1 = new Person("tony", 20);
        boolean result = p1.compareTo(p2);
        System.out.println(result);
    }
}