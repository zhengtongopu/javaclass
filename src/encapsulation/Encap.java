package encapsulation;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Encap </p>
 * <p>Description: 封装 </p>
 * <p>Date: 2022/05/21/10:05 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Encap {
    //    封装
//    把抽象出的数据【属性】和对数据的操作【方法】封装在一起，数据被保护在内部，
//    程序的其他部分只有通过被授权的操作【方法】，才能对数据进行操作
//    好处 :<1>隐藏实现细节  <2>可以对数据进行验证，保证安全合理
//    封装的实现步骤 
//    <1>对属性进行私有化private，让外部不能直接修改属性
//    <2>提供一个公共的public的set方法，用于对属性判断并赋值
//    public void setXXX(类型 参数名){
//          //输入设置
//          this.XXX = 参数名;
//    }
//    <3> 提供一个公共的public 的get方法，用于获取属性的值
//    public 数据类型 getXXX(){
//        //权限判断
//        return xx；
//    }
    public static void main(String[] args) {
        Person person = new Person();
        //person.age error
        person.setAge(20);
        person.setName("zhengtong");
        person.setJob("PM");
        person.setSalary(100000);
        String info = person.toString();
        System.out.println(info);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    public Person() {
    }

    //    构造器和封装
//    将set方法写入构造器中，仍然可以做数据规范验证
//    例
    public Person(String name, int age, double salary, String job) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.job = job;
        this.setName(name);
        this.setAge(age);
        this.setJob(job);
        this.setSalary(salary);
    }

    //封装 getter setter
    public String getName() {
        /**
         * Get  java.lang.String
         */
        return name;
    }

    public void setName(String name) {
        /**
         * Set  [name]   [java.lang.String]
         */
        this.name = name;
    }

    public int getAge() {
        /**
         * Get  int
         */
        return age;
    }

    public void setAge(int age) {
        /**
         * Set  [age]   [int]
         */

        //设置数据输入规范
        if (age >= 18 && age <= 66) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public double getSalary() {
        /**
         * Get  double
         */
        return salary;
    }

    public void setSalary(double salary) {
        /**
         * Set  [salary]   [double]
         */
        this.salary = salary;

    }

    public String getJob() {
        /**
         * Get  java.lang.String
         */
        return job;
    }

    public void setJob(String job) {
        /**
         * Set  [job]   [java.lang.String]
         */
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }
}