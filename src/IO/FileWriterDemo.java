package IO;

import java.io.*;

/**
 * Created by Doraemon on 2018/7/27.
 * 字符输入流操作
 */
public class FileWriterDemo {
    public static void main(String[] args) {

    }

    public static void write() {
        try {
            FileWriter fw = new FileWriter("cache\\Fizzer_writer.txt");
            BufferedWriter bufw = new BufferedWriter(fw);
            String msg = "这里是通过字符流写入的数据";
            bufw.write(msg);
            bufw.close();
        } catch (IOException ex) {
            System.out.println("数据写入失败");
        }

    }

    public static void read() {
        try {
            BufferedReader bufr = new BufferedReader(new FileReader("cache\\Fizzer_writer.txt"));
            String line = null;
            while((line = bufr.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ex) {

        }
    }
}