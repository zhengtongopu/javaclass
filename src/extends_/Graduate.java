package extends_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Graduate </p>
 * <p>Description: 继承 子类 </p>
 * <p>Date: 2022/05/21/20:34 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Graduate extends Student {


    //    子类继承了所有的属性和方法，非私有的属性和方法（默认属性在同包的前提下）可以直接访问
//      私有属性和方法不能再子类直接访问，要通过公共的方法去访问
//      继承的细节 :
//      <1> 子类可以在方法中直接使用父类属性和方法 (同包的前提下可以使用public，protected，默认的属性和方法)
//      <2> 子类必须调用父类的构造器，完成父类的初始化
//      （创建子类对象时，不管使用子类的哪个构造器，默认情况下总回去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中使用super制定使用哪个父类构造器完成对父类的初始化工作，否则报错）
//      <3>制定父类的构造器或者方法时使用super关键字
//      （注意，构造器中super语句必须放在第一行，与this语句冲突，所以构造器中只能存在一条super或者this语句）
//      <4> java所有的类都是Object类的子类
//      <5> 子类最多只能继承一个父类（指直接继承），即单继承机制
//      （java虽然只能继承一个父类，但是可以实现多个接口）
//      <6> 不能滥用继承，子类和父类必须构成属于关系，即子类必须是父类的一个子集

    public Graduate() {
        super(); // 调用父类的无参构造器，必须放在第一行
        System.out.println("子类无参构造器");

    }

    public Graduate(String name, int age, int score, int testAge, String testName) {
        super(name, age, score, testAge, testName);
    }

    public void info() {
//      直接调用父类属性name；
        System.out.println(name);
//      直接调用父类方法getAge()
        super.getAge();
    }

    //    main方法里无法直接调用父类属性和方法，必须new一个对象
//    public static void main(String[] args) {
//        Student stu = new Student();
//        System.out.println("name = " + stu.name + " age = " + stu.age);
////        ERROR报错
////        System.out.println("name = " + name + " age = " + age);
//        Graduate graduate = new Graduate();
//    }

    protected Object testOverride(int i) {
        System.out.println("baba" + i);
        return null;
    }
}