package annotation;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: TestAnno </p>
 * <p>Description: 注解 </p>
 * <p>Date: 2022-05-30  00:00 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    @Override: 方法重写的注解，只可以用在方法上，不能修饰其他类，包，及属性等
    如果你写了Override注解，编译器就会去检查该方法是否真的重写了父类的方法
    如果确实重写，则编译通过
    如果没有构成重写，则编译错误

    @Target(ElementType.METHOD) → 表示只能修饰方法
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    }

    @interface 并非是指的接口，而是一个注解类的意思
    @Target是修饰注解的注解，称为元注解
 */

/*
    @Deprecated 修饰某个元素，表示该元素已经过时
    ※只是不推荐使用，并不代表着不能用
    例：Object类的finalize()方法

        @Deprecated(since="9")
        protected void finalize() throws Throwable { }

    源代码：
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
        public @interface Deprecated {

    @Deprecated 可以修饰方法，类，字段，包，参数等等,具体看源码
    可以作为版本升级阶段的过渡，防止因为大量改动导致的不兼容
 */

/*
    @SuppressWarnings({""}) 大括号内写入你想抑制（即不想让其显示）的警告
    例 @SuppressWarnings({"all"}) → 抑制所有警告
    大括号内可以写入多个想抑制的警告信息，用逗号隔开
    例 @SuppressWarnings({"rawtypes", "unchecked"})

    可以作用于类，方法，属性等各个位置上。
    该注解的作用域是和你放置的位置相关。如果写在类前，则该类的相关警告都会被抑制


    源代码
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressWarnings {
        String[] value();
    }
 */

@Deprecated
public class TestAnno {
    public static void main(String[] args) {

    }
}