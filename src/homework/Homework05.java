package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework05 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/20/20:49 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Homework05 {
    //猜拳 0 石头 1 剪刀 2 布
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework05 hm = new Homework05();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            int computerNum = hm.computerNum();
            int result = hm.result(num, computerNum);
            if (result == 0) {
                System.out.println("you lose");
            } else if (result == 1) {
                System.out.println("you win");
            }

        }
    }

    public int computerNum() {
        Random r = new Random();
        int comGuessNum = r.nextInt(3);
        return comGuessNum;
    }

    public int result(int peopleNum, int computerNum) {
        if ((peopleNum + 1 % 3) == computerNum) {
            return 1;
        } else {
            return 0;
        }
    }
}