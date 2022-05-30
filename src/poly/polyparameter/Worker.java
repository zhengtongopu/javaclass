package poly.polyparameter;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Worker </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-23  22:37 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public Worker() {
    }

    @Override
    public Double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println("工人");
    }
}