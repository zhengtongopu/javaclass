package poly.polyparameter;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Manager </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-23  22:39 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double getAnnual() {
        return super.getAnnual() + this.bonus;
    }

    public void manage() {
        System.out.println("经理");
    }
}