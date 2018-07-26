package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 这里是通过字节流复制文件的Demo代码
 */
public class StreamCopyDemo {
    public static void main(String[] args) {

        copyImg();
    }

    /**
     * 通过字节流，来复制 E:\codeCache\Ariel_lin_2.jpg   文件
     */
    public static void copyImg() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:\\CodeCache\\Ariel_Lin_2.jpg");
            fos = new FileOutputStream("cache\\Ariel_lin.jpg");

            int len = 0;
            byte[] bytes = new byte[1024];

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException ex) {
            System.out.println("读取或者写入失败");

        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }

                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                System.out.println("读取或者写入流关闭失败");
            }
        }
    }
}
