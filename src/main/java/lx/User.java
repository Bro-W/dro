package lx;

/**
 * @author 王国梁
 * @date 2023/3/28 16:24
 */
public class User {
    public String name;
    public int  age;
    public void eat(){
        System.out.println("吃！");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
