package date;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: LocalDate_ </p>
 * <p>Description: 第三代日历类 </p>
 * <p>
 * JDK8之后加入了LocalDate(日期/年月日), LocalTime(时间/时分秒), LocalDateTime(年月日时分秒)三个类
 * <p>
 * DateTimeFormatter格式日期类
 * DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
 * String date = dateTimeFormatter.format(localDateTime);
 *
 * Instant时间戳。提供了一系列与Date类的转换
 *
 * <p>Date: 2022-06-02  20:12 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class LocalDate_ {
    public static void main(String[] args) {
//        用now()返回当前日期时间和对象
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        /*
        2022-06-02T20:21:31.533549
        2022
        JUNE
        6
        2
        THURSDAY
        153
        20
        21
        31
         */

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String date = dateTimeFormatter.format(localDateTime);
        System.out.println(date);
//        2022年06月02日 20小时27分钟41秒

        Instant now = Instant.now(); //2022-06-02T11:39:05.858757300Z
        System.out.println(now);
//        将Instant对象转换为Date类
        Date date1 = Date.from(now);
        //        将Date对象转成Instant对象
        Instant instant = date1.toInstant();

//        提供了plus和minus方法可以对当前时间进行加或者减
        LocalDateTime plus = localDateTime.plusDays(890);//890天以后
        System.out.println(dateTimeFormatter.format(plus));//2024年11月08日 20小时42分钟37秒
        LocalDateTime localDateTime1 = localDateTime.plusYears(3);
        System.out.println(dateTimeFormatter.format(localDateTime1));//2025年06月02日 20小时43分钟42秒

//        看看345分钟前是什么时候
        LocalDateTime localDateTime2 = localDateTime.minusMinutes(345);
        System.out.println(dateTimeFormatter.format(localDateTime2)); //2022年06月02日 14小时59分钟47秒


    }

}