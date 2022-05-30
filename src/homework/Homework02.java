package homework;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework02 </p>
 * <p>Description: TODO </p>
 * <p>Date: 2022/05/19/21:26 </p>
 *
 * @author <a href="mail to: teitsuucn@gmail.com" rel="nofollow">Zheng Tong</a>
 * @version v1.0
 * @update [No.][YYYY-MM-DD] [name][description]
 */
public class Homework02 {
    public static void main(String[] args) {
        Book book = new Book("chicken", 122);
        book.info();
        book.updatePrice();
        book.info();
    }
}

class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }

    //显示书籍信息
    public void info() {
        System.out.print("书名" + this.name + " 价格" + this.price);
    }
}