package File;

import java.io.*;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/8/8
 * @Description:
 */
public class SerializableObjTest {

    public static void main(String[] args){
        writeObj();

        System.out.println(getPerson().toString());
    }

    private static void writeObj(){

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileUtils.getPath()+"serializable.txt"));

            Person p = new Person("Fizzer","12");
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Person getPerson(){
        Person p = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileUtils.getPath()+"s.txt"));

            p = (Person) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }
}
