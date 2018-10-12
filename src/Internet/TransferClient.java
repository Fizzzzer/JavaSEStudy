package Internet;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/10/11
 * @Description:
 */
public class TransferClient {

    public static final String ipAddress = "10.10.116.157";
    public static final int port = 10000;

    public static void main(String[] args) {
        sendMsg();
    }

    public static void sendMsg() {
        /**
         * 步骤详解
         * 1：读取键输入流
         * 2：获取socket输出流，并写入数据
         * 3：获取socket输入流，获取服务端返回的数据
         */

        try {
            Socket mSocket = new Socket(ipAddress, port);

            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufwOut = new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream()));

            BufferedReader bufrIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            String line = null;
            while ((line = bufr.readLine()) != null) {
                bufwOut.write(line);
                bufwOut.newLine();
                bufwOut.flush();

                String msg = bufrIn.readLine();
                System.out.println("server = " + msg);
                if ("over".equals(line)) {
                    break;
                }
            }
            mSocket.close();
            bufr.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
