package homework;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework14 </p>
 * <p>Description: 泛型课堂练习1 </p>
 * <p>Date: 2022-06-09  20:04 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework14 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("TOM", 10000, new Mydate(2000, 10, 11)));
        employees.add(new Employee("TOM", 2000, new Mydate(2005, 10, 10)));
        employees.add(new Employee("JACK", 30000, new Mydate(2000, 1, 9)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    return 0;
                }
                int result = o1.getName().compareTo(o2.getName());
                if (result != 0) {
                    return result;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());

                //                这段代码太啰嗦了，不如直接交给MyDate类去实现
//                result = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                if (result != 0) {
//                    return result;
//                }
//                result = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                if (result != 0) {
//                    return result;
//                }
//                result = o1.getBirthday().getDay() - o2.getBirthday().getDay();
//                if (result != 0) {
//                    return result;
//                }
//                return 0;
            }
        });
        System.out.println(employees);

    }
}

class Mydate implements Comparable {
    private int year;
    private int month;
    private int day;


    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        Mydate mydate = (Mydate) o;
        int result = year - mydate.getYear();
        if (result != 0) {
            return result;
        }
        result = month - mydate.getMonth();
        if (result != 0) {
            return result;
        }
        result = day - mydate.getDay();
        if (result != 0) {
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class Employee {
    private String name;
    private int salary;
    private Mydate birthday;

    public Employee(String name, int salary, Mydate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }


//    @Override
//    public int compareTo(Object o) {
//        int result = this.name.compareTo(((Employee)o).name);
//        if (result == 0) {
//            return this.birthday.compareTo(((Employee)o).birthday);
//        }
//        return result;
//    }
}