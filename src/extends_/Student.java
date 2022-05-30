package extends_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: father </p>
 * <p>Description: 继承 父类 </p>
 * <p>Date: 2022/05/21/20:33 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Student {
    protected String name;
    protected int age;
    protected int score;
    private int testAge; //用于测试子类能否接收到这个变量

    public String testName;

    public Student(String name, int age, int score, int testAge, String testName) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.testAge = testAge;
        this.testName = testName;
    }

    public Student() {
        System.out.println("父类无参构造器");
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", score=" + score + '}';
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTestAge() {
        return testAge;
    }

    public void setTestAge(int testAge) {
        this.testAge = testAge;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void testSum() {
        System.out.println("yeye");
    }

}