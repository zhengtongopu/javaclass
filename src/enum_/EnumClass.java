package enum_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: EnumClass </p>
 * <p>Description: 枚举类      即把具体的对象一个一个列举出来的类</p>
 * <p>
 * 枚举是一种常量的集合，即属于一种特殊的类，里面只包含一组特定的对象
 * <p>
 * 实现方式：
 * 1. 自定义类实现枚举
 * 2. 使用enum关键字实现枚举
 * <p>
 * 自定义类实现枚举:
 * 1. 将类构造器私有化，防止外部直接new对象
 * 2. 去除setXX相关的方法，保留getXX方法（即完成只读，不能修改）
 * 3. 在类内部，直接创建固定的对象（应该有几个对象就创建几个）
 * 4. 优化:加入final修饰符，保证指向对象的引用（SPRING, SUMMER等）不会被改变（枚举对象名通常使用全部大写，常量的命名规范）（枚举对象根据需要，也可以有多个属性）
 * <p>
 * 使用enum关键字实现枚举：
 * 1. 使用关键字enum替代class
 * 2. public static final Season SPRING = new Season("春天", "温暖"); 用 SPRING("春天", "温暖"); 替代直接使用 （即 常量名（实参列表））
 * 3. 如果有多个常量（对象），则使用逗号间隔即可
 * 4. 如果使用enum关键字来实现枚举类，要求将定义常量对象语句写在最前列（类中的第一行）
 * 5. 如果我们使用的是无参构造器创建枚举对象，则实参列表和小括号都可以省略
 *
 * 元注解：修饰注解的注解（了解）
 *
 *
 * <p>Date: 2022-05-29  16:16 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    @Retention      指定注解的作用范围，三种：SOURCE, CLASS, RUNTIME
    @Target         指定注解可以在哪里使用
    @Documented     指定该注解是否会在javadoc中体现
    @Inherited      子类会继承父类注解
 */

public class EnumClass {
    public static void main(String[] args) {
//        当输出一个对象时，会默认调用toString方法
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
        /*
            自定义类加载了
            普通代码块
            普通代码块
            普通代码块
            普通代码块
            Season{name='春天', description='温暖'}
            Season{name='夏天', description='炎热'}
            Season{name='秋天', description='凉爽'}
            Season{name='冬天', description='寒冷'}
         */
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
        /*
            普通代码块
            普通代码块
            普通代码块
            普通代码块
            枚举类加载了
            SPRING
            SUMMER
            AUTUMN
            WINTER
         */

    }
}


class Season {

    private String name;
    private String description;

    static {
        System.out.println("自定义类加载了");
    }

    {
        System.out.println("普通代码块");
    }

//    需求，创建一个季节类
//    分析如下：
//    1. 季节的值是有限的几个值（spring, summer, autumn, winter）
//    2. 只读，不需要修改
//    因此我们使用枚举来解决上述需求

//    自定义枚举

    //1. 将类构造器私有化，防止外部直接new对象
    public Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //2. 去除setXX相关的方法，保留getXX方法（即完成只读，不能修改）
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //3. 在Season类内部，直接创建固定的对象
//4. 加入final修饰符，保证指向对象的引用（SPRING, SUMMER等）不会被改变
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    //    重写toString()方法，当输出一个对象时，会默认调用toString方法
    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

//使用enum关键字创建枚举类
//1. 使用关键字enum替代class
enum Season2 {
    //     2. public final static Season SPRING = new Season("春天", "温暖"); 用 SPRING("春天", "温暖"); 替代直接使用 （即 常量名（实参列表））
    /*
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");
    */
//    3. 如果有多个常量（对象），则使用逗号间隔即可
//    4. 如果使用enum关键字来实现枚举类，要求将定义常量对象语句写在最前列（类中的第一行）
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
    private String name;
    private String description;

    static {
        System.out.println("枚举类加载了");
    }

    {
        System.out.println("普通代码块");
    }

    Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }


}
