package poly.polyparameter;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: PolyParameter </p>
 * <p>Description: 多态的应用之多态参数 </p>
 * <p>Date: 2022-05-23  22:33 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class PolyParameter {
    /**
     * 多态的应用之多态参数
     */

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }

    public static void main(String[] args) {
        PolyParameter pp = new PolyParameter();
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 50000, 20000);
        pp.showEmpAnnual(tom);
        pp.showEmpAnnual(milan);

//        添加一个方法，如果是普通员工则调用work方法，如果是经理则调用manage方法
        pp.testWork(tom);
//        pp.equals(tom);
    }
}