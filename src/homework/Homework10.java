package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework10 </p>
 * <p>Description: 字符串统计 </p>
 * <p>Date: 2022-06-03  13:56 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    输入字符串，判断里面有多少大写字母，多少小写字母，多少个数字
 */

public class Homework10 {
    public static void main(String[] args) {
        String str= "ASDWsadwax1231sfazxAs";
        countStr(str);

    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("输入不能为空");
            return;
        }
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                numCount++;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowerCount++;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upperCount++;
            }

        }
        System.out.println(numCount);
        System.out.println(lowerCount);
        System.out.println(upperCount);
    }
}