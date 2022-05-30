package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework04 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/20/20:28 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Homework04 {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject p = new PassObject();
        p.printAreas(c, 5);

    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public Circle() {
//
//    }

    public Double fineArea() {
        return this.radius * this.radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println("radius = " + i + " area = " + c.fineArea());
            System.out.println("radius = " + i + " area = " + c.fineArea());
        }
    }
}