package arraysclass;


import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: ArrayExercise </p>
 * <p>Description: Arrays类练习 </p>
 * <p>Date: 2022-06-02  12:46 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 90);
        books[1] = new Book("新金瓶梅", 100);
        books[2] = new Book("新青年文摘", 5);
        books[3] = new Book("java从入门到入土", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.price - o2.price;
            }
        });
//        for(Book book : books) {
//            System.out.println(book.name);
//        }
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.price - o1.price;
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.length() - o2.name.length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    public String name;
    public Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}