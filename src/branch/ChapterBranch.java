package branch;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ChapterBranch </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/14/22:43 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class ChapterBranch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.print("age is " + age + " and $500");
        } else if (age < 65) {
            System.out.print("age is " + age + " and $2000");
        } else {
            System.out.print("age is " + age + " and $1000");
        }

//        boolean k = true;
//        if (!k) {
//            System.out.print("ssss");
//        }
//        else {
//            System.out.print("aaaaaaaaaa");
//        }

    }
}

