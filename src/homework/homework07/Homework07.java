package homework.homework07;

//import poly.polyarray.Teacher;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework07 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-24  20:51 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework07 {
    public static void main(String[] args) {
        Professor p = new Professor("tom", 20, "jiaoshou", 50000, 1.3);
        p.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private int salary;
    private double grade;

    public Teacher(String name, int age, String post, int salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public Teacher() {
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}';
    }
}


class Professor extends Teacher {
    public Professor() {
    }

    public Professor(String name, int age, String post, int salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}