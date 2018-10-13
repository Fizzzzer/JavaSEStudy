package Internet;

import java.io.*;
import java.net.Socket;

/**
 * Created by Doraemon on 2018/10/12.
 * 文件上传客户端
 */
public class FileUploadClient {

    public static void main(String[] args) {

//        String filePath = "cache" + File.separator + "Fizzer.txt";
        String filePath = "Config.java";
        uploadFile(filePath);
    }

    private static void uploadFile(String filepath) {

        try {
            BufferedReader bufr = new BufferedReader(new FileReader(new File(filepath)));

            Socket mSocket = new Socket(Config.ipAddress, Config.port);

            BufferedWriter bufwOut = new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream()));

            BufferedReader bufrIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));

            String line = null;
            while((line = bufr.readLine()) != null){
                bufwOut.write(line);
                bufwOut.flush();
            }
            mSocket.shutdownOutput();
            String msg = bufrIn.readLine();
            System.out.println(msg);

            bufr.close();
            mSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
