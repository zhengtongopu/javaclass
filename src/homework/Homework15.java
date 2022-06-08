package homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: Homework15 </p>
 * <p>Description: 泛型课后作业1 </p>
 * <p>Date: 2022-06-09  22:11 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class Homework15 {
    public static void main(String[] args) {


    }
}

class DAO<T> {
    public Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList();
        list.addAll(map.values());
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAOTest {

    @Test
    void save() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "jack"));
        userDAO.save("002", new User(2, 13, "tom"));
        userDAO.save("003", new User(3, 25, "john"));

//        List<User> list = userDAO.list();
//        System.out.println(list);
    }

    @Test
    void get() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "jack"));
        userDAO.save("002", new User(2, 13, "tom"));
        userDAO.save("003", new User(3, 25, "john"));
        System.out.println(userDAO.get("003"));
    }

    @Test
    void update() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "jack"));
        userDAO.save("002", new User(2, 13, "tom"));
        userDAO.save("003", new User(3, 25, "john"));
        userDAO.update("003", new User(11, 10, "luck"));
        List<User> list = userDAO.list();
        System.out.println(list);
    }

    @Test
    void list() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "jack"));
        userDAO.save("002", new User(2, 13, "tom"));
        userDAO.save("003", new User(3, 25, "john"));
        List<User> list = userDAO.list();
        System.out.println(list);
    }

    @Test
    void delete() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 18, "jack"));
        userDAO.save("002", new User(2, 13, "tom"));
        userDAO.save("003", new User(3, 25, "john"));
        userDAO.delete("003");
        List<User> list = userDAO.list();
        System.out.println(list);

    }
}