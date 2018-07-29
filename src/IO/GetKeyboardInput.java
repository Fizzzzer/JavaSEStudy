package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 获取键盘的输入字节流
 * 将输入的字节流转换成字符流进行读取操作
 */
public class GetKeyboardInput{
    public static void main(String[] args) throws IOException{
//        getKeyInput();

        transformReader();
    }

    /**
     * 获取键盘的输入字节流
     * @throws IOException Exception
     */
    public static void getKeyInput() throws IOException {
        InputStream in = System.in;
        int ch = 0;
        while((ch = in.read()) != -1){
            System.out.println((char) ch);
        }
    }

    /**
     * 读取流的转换  将键盘的输入字节流转换成字符流，然后进行输出
     * @throws IOException  Exception
     */
    public static void transformReader() throws IOException{
        //获取键盘的输入的字节流
        InputStream in = System.in;
        //将字节流转换成字符流
        InputStreamReader isr = new InputStreamReader(in);
        //将字符流包装到缓冲中
        BufferedReader bufr = new BufferedReader(isr);

        String line = null;
        while ((line = bufr.readLine()) != null){
            System.out.println(line);
        }
    }
}
