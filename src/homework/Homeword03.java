package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homeword03 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/19/22:26 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */


public class Homeword03 {

    public static void main(String[] args) {
        Circuit circuit = new Circuit(100);
        double result = circuit.area();
        double result2 = circuit.len();
        System.out.println("area = " + result + " len = " + result2);
    }
}

class Circuit {
    double radius;

    public Circuit(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double len() {
        return Math.PI * radius * 2;
    }
}