package poly;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Master </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/22/18:51 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Master {
    private String masterName;

    public Master(String masterName) {
        this.masterName = masterName;
    }

    public Master() {
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }


    /**
     * 传统方法导致代码单位复用性不够高，不利于代码维护
     * 因此引出新的概念  多态  即方法或对象具有多种形态
     * 方法的多态的体现：继承中方法的重写和重载
     * 对象的多态的体现：
     * <1>一个对象的编译类型和运行类型可以不一致。
     * 例如   Animal animal = new Dog() 可以让一个父类的引用指向子类的对象 [animal的编译类型是animal，运行类型是Dog]
     *
     * <2>编译类型在定义对象时，就确定了，不能改变，但是运行类型是可以变化的。
     * 例如   animal = new Cat()  [animal的运行类型变成了Cat。但是编译类型依然是Animal]
     * <3>编译类型看定义时=号的左边，运行类型看=号的右边
     */


//    public void feed(Dog dog, Bone bone) {
//        System.out.println("master " + masterName + dog.getName() + bone.getFoodName());
//    }
//
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("master " + masterName + cat.getName() + fish.getFoodName());
//    }

    //多态机制，形参列表只需要传父类的对象，即可以随时通过对象运行类型的切换访问所有子类
    public void feed(Animal animal, Food food) {
        System.out.println("master " + masterName + " give " + animal.getName() + " a " + food.getFoodName());
    }
}