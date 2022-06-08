package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework09 </p>
 * <p>Description: 注册处理题 </p>
 * <p>Date: 2022-06-03  13:30 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
    输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象要求
    1. 用户名长度在2到5的范围
    2. 密码长度为8到16
    3. 邮箱中必须包含@和.，且要求@在.的前面
 */

public class Homework09 {
    public static void main(String[] args) {
        String username = "zheng";
        String pwd = "345134513451";
        String email = "123gmail@.com";
        checkInput(username, pwd, email);

    }

    public static void checkInput(String username, String pwd, String email) {
        if (username == null || pwd == null || email == null) {
            System.out.println("输入不能有为空的");
            return;
        }

//        写复杂条件判断时，先写符合要求的条件，然后直接取反，即得到了想要的输入检查条件

        if (!(username.length() >= 2 && username.length() <= 5)) {
            throw new RuntimeException("用户名长度应该在2到5的范围");
        }

        if (!(pwd.length() >= 8 && pwd.length() <= 16)) {
            throw new RuntimeException("密码长度为8到16");
        }

        if (!(email.indexOf('@') > 0 && email.indexOf('.') > email.indexOf('@') + 1)) {
            throw new RuntimeException("邮箱中必须包含@和.，且要求@在.的前面");
        }

        System.out.println("添加内容成功");
    }
}