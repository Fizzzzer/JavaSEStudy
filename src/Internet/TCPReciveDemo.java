package Internet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/9/20
 * @Description:
 */
public class TCPReciveDemo {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(7518);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            byte[] buf = new byte[1024];
            BufferedInputStream bis = new BufferedInputStream(is);
            int len = bis.read(buf);
            System.out.println(new String(buf,0,len) + "ip==" + socket.getInetAddress().getHostAddress());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
