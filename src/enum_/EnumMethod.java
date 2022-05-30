package enum_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: EnumMethod </p>
 * <p>Description: Enum类的各种方法的使用 </p>
 * <p>Date: 2022-05-29  22:49 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
//        Enum().toString() 输出该枚举对象的名字
        System.out.println(autumn); //AUTUMN
//        ordinal() 输出的是该枚举对象的次序/编号，从0开始编号
//        spring：0 summer：1 autumn：3 winter：4
        System.out.println(autumn.ordinal()); //2
//        values() 返回Season2[]数组，返回含有定义的所有枚举对象
        for (Season2 sea : Season2.values()) { //增强for循环
            System.out.println(sea);
        }
        /*
            SPRING
            SUMMER
            AUTUMN
            WINTER
         */

//        valueOf() 将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
//        1. 根据你输入的字符串"AUTUMN"到枚举类中寻找对应的枚举对象
//        2. 存在的话则返回，否则则报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1 == autumn); //true

//        compareTo() 比较两个枚举常量的编号
        System.out.println(Season2.SPRING.compareTo(Season2.SUMMER)); // -1
        /*
        public final int compareTo(E o) {
            Enum<?> other = (Enum<?>)o;
            Enum<E> self = this;
            if (self.getClass() != other.getClass() && // optimization
                self.getDeclaringClass() != other.getDeclaringClass())
                throw new ClassCastException();
            return self.ordinal - other.ordinal;
//            Season2.SPRING = 0, Season2.SUMMER = 1;
//            Season2.SPRING.compareTo(Season2.SUMMER)返回的是0 - 1 = -1
        }
         */
    }
}