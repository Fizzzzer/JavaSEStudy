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

    public static void main(String[] args) {
        sendMsg();
    }

    public static void sendMsg() {
        Socket mSocket;
        try {
            mSocket = new Socket(InetAddress.getByName("192.0.0.1"), 10000);
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufwOut = new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream()));

            BufferedReader bufrIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            String line = null;
            while((line = bufr.readLine())!= null){
                bufwOut.write(line);

                String str = bufrIn.readLine();
                System.out.println("Server=" + str);

                if("over".equals(line)){
                    break;
                }
            }
            bufr.close();
            mSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
