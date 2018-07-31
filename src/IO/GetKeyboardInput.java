package IO;

import java.io.*;

/**
 * 获取键盘的输入字节流
 * 将输入的字节流转换成字符流进行读取操作
 */
public class GetKeyboardInput {
    public static void main(String[] args) throws IOException {
//        getKeyInput();

//        transformReader();

//        saveToFile();

        resetIn();
    }

    /**
     * 获取键盘的输入字节流
     *
     * @throws IOException Exception
     */
    public static void getKeyInput() throws IOException {
        InputStream in = System.in;
        int ch = 0;
        while ((ch = in.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    /**
     * 读取流的转换  将键盘的输入字节流转换成字符流，然后进行输出
     *
     * @throws IOException Exception
     */
    public static void transformReader() throws IOException {
        //获取键盘的输入的字节流
        InputStream in = System.in;
        //将字节流转换成字符流
        InputStreamReader isr = new InputStreamReader(in);
        //将字符流包装到缓冲中
        BufferedReader bufr = new BufferedReader(isr);

        String line = null;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * 将键盘的标准输入流保存为文件
     */
    public static void saveToFile() {
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufw = new BufferedWriter(new FileWriter("cache" + File.separator + "KeyboardFile.txt"));
            String line = null;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (Exception ex) {

        }
    }

    /**
     * 重新设置键盘的标准输入流，并将读取的文件打印在控制台上
     *
     * @throws IOException Ex
     */
    public static void resetIn() throws IOException {
        System.setIn(new FileInputStream("cache" + File.separator + "KeyboardFile.txt"));

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
    }
}
