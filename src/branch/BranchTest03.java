package branch;

import java.util.Scanner;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: BranchTest03 </p>
 * <p>Description: TODO switch-case 分支结构
 * 表达式数据类型，应和case后数据类型保持一致，或者是可以自动转成相互比较的类型
 * switch（表达式）中表达式的返回值必须是 byte short int char enum String
 * case 子句中的值必须是常量不能是变量
 * default子句是可选的，当没有匹配的case时，执行default，建议不论如何最后加上default子句
 * 如果子句内没有break，则顺序执行下一条子句直到遇到break
 * </p>
 * <p>Date: 2022/04/16/10:44 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class BranchTest03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char week = scanner.next().charAt(0);
        switch (week) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            default:
                System.out.println("周末");
                break;
        }
    }
}