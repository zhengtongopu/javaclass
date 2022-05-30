package circle;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Circle </p>
 * <p>Description: TODO
 * 空心金字塔</p>
 * <p>Date: 2022/04/21/20:36 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Circle {

    public static void main(String[] args) {
        int num = 8;
//        int length = 7;
        char star = '*';
        char space = ' ';

        //实心金字塔
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 0; j--) {
                System.out.print(space);
            }
            for (int count = 1; count <= 2 * i - 1; count++) {
                System.out.print(star);
            }
            System.out.println();
        }

        //空心金字塔
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 0; j--) {
                System.out.print(space);
            }
            for (int count = 1; count <= 2 * i - 1; count++) {
                if (count == 1 || count == 2 * i - 1 || i == num) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }

            }
            System.out.println();
        }

        //空心菱形
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 0; j--) {
                System.out.print(space);
            }
            for (int count = 1; count <= 2 * i - 1; count++) {
                if (count == 1 || count == 2 * i - 1) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }

            }
            System.out.println();
        }
        for (int i = num; i >=0; i--) {
            for (int j = num - i; j >= 0; j--) {
                System.out.print(space);
            }
            for (int count = 1; count <= 2 * i - 1; count++) {
                if (count == 1 || count == 2 * i - 1) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }

            }
            System.out.println();
        }
    }
}