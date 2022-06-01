package extends_;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: testSuper </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/22/13:34 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class TestSuper extends Graduate {

    public void testSum() {
        System.out.println("sunzi");
    }

    public void test() {
        testSum(); // 就近原则，现在本类找是否存在且是否可以访问，如果可以，则返回，不可以则在父类寻找
        super.testSum(); // 直接在父类中寻找是否存在且是否可以访问，如果可以，则返回
    }


    public String testOverride(int i) {
//        方法重写
//        子类的方法的参数，方法名称要与父类方法的参数，方法名称完全一致
//        子类方法的返回类型和父类方法的返回类型一样，或者是父类方法返回类型的子类 (此处的父类testOverride()返回类型是object类，子类重写后返回类型是String，是object的子类，所以可以使用)
//        子类方法不能缩小父类方法的访问权限 (public > protected > 默认 > private)，例如这里父类是protected，子类可以是protected或者是public

        System.out.println("erzi" + i);
        return null;
    }

//    注意，当子类中有和父类中的成员（属性和方法）重名时，为了访问父类成员，必须通过super，如果没有，则super，this，直接访问的效果是一样的。

    public static void main(String[] args) {
        TestSuper ts = new TestSuper();
        ts.test();
//        子类可以直接使用父类中定义的常量，不需要类名.常量名（接口同样适用）
        System.out.println(PI);
    }
}