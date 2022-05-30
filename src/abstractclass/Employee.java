package abstractclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Employee </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-26  23:41 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public abstract class Employee {
    private String name;
    private int id;
    private int salary;
    private String grade;


    public Employee(String name, int id, int salary, String grade) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.grade = grade;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + ", salary=" + salary + ", grade='" + grade + '\'' + '}';
    }
}