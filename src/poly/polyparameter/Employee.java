package poly.polyparameter;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Employee </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-23  22:35 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Double getAnnual() {
        return 12 * this.salary;
    }
}