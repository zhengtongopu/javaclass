package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework11 </p>
 * <p>Description: 集合类课后练习1 </p>
 * <p>Date: 2022-06-09  09:14 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework11 {
    public static void main(String[] args) {
        News news = new News(new StringBuffer("新冠确诊病例超千万，数百万印度教新图赴恒河\"圣浴\"引民众担忧"));
        News news1 = new News(new StringBuffer("男子突然想起2个月前钓的鱼还在网兜里，捞出一看赶紧放生"));
        ArrayList<News> news2 = new ArrayList<>();
        news2.add(news);
        news2.add(news1);
//        Collections.shuffle(news2);
//        Iterator iterator = news2.iterator();
//        while (iterator.hasNext()) {
//            News next = (News) iterator.next();
//            if (next.getTitle().length() > 15) {
//                continue;
//            }
//            System.out.println(next);
//        }
        for (int i = news2.size() - 1; i >= 0; i--) {
            StringBuffer title = news2.get(i).getTitle();
            if (title.length() > 15) {
                System.out.println(title.substring(0, 16) + "...");
                continue;
            }
            System.out.println(news2.get(i));
        }
    }
}

class News {
    private StringBuffer title;
    private StringBuffer text;

    public News(StringBuffer title) {
        this.title = title;
    }

    public StringBuffer getTitle() {
        return title;
    }

    public void setTitle(StringBuffer title) {
        this.title = title;
    }

    public StringBuffer getText() {
        return text;
    }

    public void setText(StringBuffer text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "title=" + title +
                '}';
    }
}