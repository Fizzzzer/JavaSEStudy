package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

    public static void main(String[] args) {
        inputStream();

    }

    /**
     * 输入流的测试代码
     */
    public static void inputStream() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("cache\\Fizzer.txt");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException ex) {
            System.out.println("输入流读取失败");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("输入流关闭失败");
            }
        }
    }

    /**
     * 输出流的测试代码
     */
    public static void outputStream() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("cache\\Fizzer.txt");

            String msg = "这里是Doraemon倩倩的写入文件";
            fos.write(msg.getBytes());
        } catch (IOException ex) {
            System.out.println("写入流写入失败");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                System.out.println("写入流关闭失败");
            }
        }
    }
}
