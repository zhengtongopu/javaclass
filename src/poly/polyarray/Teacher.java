package poly.polyarray;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Teacher </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-23  22:13 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Teacher extends Person {
    private double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " salary: " + salary;
    }

    public void teacher() {
        System.out.println("teacher " + getName() + "is teaching");
    }
}