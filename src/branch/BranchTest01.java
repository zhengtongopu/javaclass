package branch;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: BranchTest01 </p>
 * <p>Description: TODO if-else 分支 </p>
 * <p>Date: 2022/04/16/9:57 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class BranchTest01 {
    public static void main(String[] args) {
        /**
         * @Title：main
         * @Description: TODO
         * @param: [args]
         * @return: void
         * @author <a href="mail to: *******@******.com" rel="nofollow">Zheng Tong</a>
         * @CreateDate: 2022/04/16/10:23 </p> 
         * @update: [No.][YYYY-MM-DD] [name][description]     
         */
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a > 10.0 && b < 20.0) {
            System.out.println(a + b);
        } else {
            System.out.println("no");
        }
        //
        //
        //
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = c + d;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("ok");
        } else {
            System.out.println("kk");
        }
        //
        //
        //
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) | year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("BU SHI RUN NIAN");
        }
    }
}