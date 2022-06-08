package date;

import java.util.Calendar;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Calender </p>
 * <p>Description: 第二代日历类 </p>
 * <p>Date: 2022-06-02  19:55 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Calendar_ {
    public static void main(String[] args) {
//        Calendar是一个抽象类，并且构造器是protected
//        可以通过getInstance()来获取实例
//        提供大量的方法和字段
//        Calendar没有专门的格式化方法，需要程序员自己来组合
        Calendar calendar = Calendar.getInstance();
        System.out.printf("%d年%d月%d日%n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(String.format("%d时%d分%d秒%n", calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND)));
    }
}