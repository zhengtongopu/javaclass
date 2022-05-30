package zt20220219;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Zheng Tong
 * \* Date: 2022/2/19-10:30
 * \* Title: TODO 转义符的运用
 * \* Description: TODO
 *  \t \n \\ \" \' \r
 * \
 */
public class Chapter20 {
    /**
     * ClassName：Chapter20
     * @Description: TODO
     * @author <a href="mail to: *******@******.com" rel="nofollow">Zheng Tong</a>
     * @CreateDate: 2022/2/19/12:03 </p> 
     * @update: [No.][YYYY-MM-DD] [name][description]     
     */
    public static void main(String[] args){
        System.out.print("hello\tword\n\\GG\\zheng\\tong\"ni\'hao");
        System.out.print("zheng\\tong\"ni\rhao");
        /** 文档注释
         * hello	word
         * hao
         */

        //单行注释
        /*
        多行注释
         */

        System.out.println(0>>2);


    }

}


class Exercise{
    /**
     * ClassName：Exercise
     * @Description: TODO
     * @author <a href="mail to: *******@******.com" rel="nofollow">Zheng Tong</a>
     * @CreateDate: 2022/2/19/12:03 </p> 
     * @update: [No.][YYYY-MM-DD] [name][description]     
     */
    public static void main(String[] args){
        System.out.println("书名\t作者\t价格\n三国志\t罗贯中\t200");
        /**
         * 书名	作者	价格
         * 三国志	罗贯中	200
         */
    }
}