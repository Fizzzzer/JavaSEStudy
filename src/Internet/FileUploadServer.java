package Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Doraemon on 2018/10/12.
 * 文件上传服务端
 */
public class FileUploadServer {
    public static void main(String[] args) {
        receiveFile();
    }

    public static void receiveFile() {
        File file = new File("cache" + File.separator + "server");
        if (!file.exists()) {
            file.mkdir();
        }

        try {
            ServerSocket ss = new ServerSocket(Config.port);
            Socket mSocket = ss.accept();

            String ip = mSocket.getInetAddress().getHostName();
            System.out.println("connect ip = " + ip);

            BufferedReader bufrIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));

            BufferedWriter bufr = new BufferedWriter(new FileWriter(new File(file, System.currentTimeMillis() + ".txt")));

            OutputStream out = mSocket.getOutputStream();

            String line = null;
            while ((line = bufrIn.readLine()) != null) {
                System.out.println(line);
                bufr.write(line);
                bufr.flush();
                bufr.newLine();
            }

            out.write("上传成功".getBytes());

            bufr.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
