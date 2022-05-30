package branch;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: BranchTest02 </p>
 * <p>Description: TODO if-else-else if 分支
 *                 </p>
 * <p>Date: 2022/04/16/10:24 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class BranchTest02 {
    public static void main(String[] args) {
        //接受字符 char gender = scanner.next().charAt(0)
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        char gender = scanner.next().charAt(0);
        if (score <= 0.8) {
            System.out.println("淘汰");
        } else if (gender == '男') {
            System.out.println("男子组");
        } else {
            System.out.println("女子组");
        }


    }
}
