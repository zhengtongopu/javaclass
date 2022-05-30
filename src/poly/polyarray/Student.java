package poly.polyarray;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Student </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022-05-23  22:09 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Student extends Person {
    private double score;

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public Student() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + " score: " + score;
    }

    public void student() {
        System.out.println("student " + getName() + "is learning");
    }
}