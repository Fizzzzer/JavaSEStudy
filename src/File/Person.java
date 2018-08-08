package File;

import java.io.Serializable;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/8/8
 * @Description:
 */
public class Person implements Serializable {

    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "===" +age;
    }
}
