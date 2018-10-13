package Internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/10/11
 * @Description:
 */
public class TransferService {

    public static void main(String[] args) {
        reciveMsg();
    }

    public static void reciveMsg() {

        /**
         * 逻辑整理
         * 1：读取服务端的输入流
         * 2：获取数据进行转换，写入服务端的返回数据流中
         */
        try {
            ServerSocket ss = new ServerSocket(Config.port);
            Socket mSocket = ss.accept();

            String ip = mSocket.getInetAddress().getHostName();
            System.out.println("connect ip : " + ip);

            BufferedReader bufrIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            BufferedWriter bufrOut = new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream()));

            String line = null;
            while ((line = bufrIn.readLine()) != null) {

                System.out.println("Client send : " + line);

                String backMsg = line.toUpperCase();
                bufrOut.write(backMsg);
                bufrOut.newLine();
                bufrOut.flush();
            }

            ss.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
