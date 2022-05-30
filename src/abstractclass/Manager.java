package abstractclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Manager </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-26  23:45 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int id, int salary, String grade, int bonus) {
        super(name, id, salary, grade);
        this.bonus = bonus;
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + " is working");
    }
}