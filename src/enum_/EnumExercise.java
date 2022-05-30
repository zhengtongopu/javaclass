package enum_;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: EnumExercise </p>
 * <p>Description: 枚举类实现接口 </p>
 *
 * ※枚举类不能继承其他类，因为enum类已经默认继承了Enum类。但是可以实现接口。
 *
 * <p>Date: 2022-05-29  23:16 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class EnumExercise {
    public static void main(String[] args) {
        for (Week day : Week.values()) {
            day.read();
        }
    }
}

enum Week implements Doing{
    MONDAY("周一"), TUESDAY("周二"), WEDNESDAY("周三"), THURSDAY("周四"), FRIDAY("周五");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void read() {
        System.out.println(name + "读书");
    }

    @Override
    public void learning() {
        System.out.println(name + "学习");
    }
}

interface Doing {
    void read();
    void learning();
}