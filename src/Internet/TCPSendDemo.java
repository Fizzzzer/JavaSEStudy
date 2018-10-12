package Internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/9/20
 * @Description:
 */
public class TCPSendDemo {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("192.168.31.245",7518);
            OutputStream os = socket.getOutputStream();
            os.write("Fizzer".getBytes());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
