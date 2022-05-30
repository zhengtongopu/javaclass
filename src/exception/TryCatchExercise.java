package exception;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: TryCatchExercise </p>
 * <p>Description: TryCatch的最佳应用案例 </p>
 * <p>Date: 2022-05-30  22:11 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        do {
            try {
                String str = scanner.next();
                int result = Integer.parseInt(str);
                System.out.println(result);
                loop = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (loop);



    }
}