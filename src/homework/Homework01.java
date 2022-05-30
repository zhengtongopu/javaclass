package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework01 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/19/21:21 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Homework01 {
    public static void main(String[] args) {
        A01 a = new A01();
        String[] strs = {"111", "231", "101", "311"};
        int result = a.find("111", strs);
        System.out.println(result);
    }
}

//考虑数组为空，或者直接传null的情况，修改下面的代码


class A01 {
    public int find(String findStr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }

}