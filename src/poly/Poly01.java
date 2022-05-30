package poly;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Poly01 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/22/18:47 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("tom");
        Dog dog = new Dog("dog");
        Bone bone = new Bone("bone");
        master.feed(dog, bone);

//        运用多态后,形参列表只需要传父类的对象，即可以随时通过对象运行类型的切换访问所有子类
//        public void feed(Animal animal, Food food) {
//            System.out.println("master " + masterName + "give" + animal.getName() + "a" + food.getFoodName());
//        }


        Master newMaster = new Master("tom");
        Animal animal = new Dog("dog");
        Food food = new Bone("bone");
        newMaster.feed(animal, food);
        animal = new Cat("cat");
        food = new Fish("fish");
        newMaster.feed(animal, food);
//        但是上述这种写法（即animal = new cat()）会导致无法访问子类特有的属性与方法，因此不推荐
//        例如 animal.test(); 报错

//        推荐下列写法配合feed(animal, food)
        Dog dog1 = new Dog("nike");
        Bone bone1 = new Bone("ttk");
        master.feed(dog1, bone1);

    }
}