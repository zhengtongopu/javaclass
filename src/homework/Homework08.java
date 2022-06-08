package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework08 </p>
 * <p>Description: String翻转 </p>
 * <p>Date: 2022-06-02  20:52 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework08 {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(change(str, 1, 4));

    }

    public static String change(String str, int start, int end) {
        char[] chars = str.toCharArray();
        for (; start < end; start++, end--) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

        }
        return new String(chars);
    }
}