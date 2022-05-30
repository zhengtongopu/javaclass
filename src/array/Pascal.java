package array;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Pascal </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/04/27/0:01 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Pascal {
    //杨辉三角
    /*
    1
    1, 1
    1, 2, 1
    1, 3, 3, 1
    1, 4, 6, 4, 1
     */
    //从第三行开始，对于非第一个元素和最后一个元素的值
    //a[i][j] = a[i-1][j] + a[i-1][j-1]
    public static void main(String[] args) {
        int size = 10;
        int[][] pascal = new int[size][];
        for(int i = 0; i < pascal.length; i++){
            pascal[i] = new int[i+1];
            for(int j = 0; j < pascal[i].length; j++){
                if (j == 0 || j == i){
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                }
            }
        }

        for(int i = 0; i < pascal.length; i++){
            for (int j = 0; j < pascal[i].length; j++){
                System.out.print(pascal[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}