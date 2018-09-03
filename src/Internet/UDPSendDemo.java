package Internet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/9/3
 * @Description: UDP de Demo
 */
public class UDPSendDemo {

    public static void main(String[] args) {
        sendData("Fizzer");
    }

    public static void sendData(String data) {
        DatagramSocket ds;
        try {
            ds = new DatagramSocket();

            byte[] datas = data.getBytes();
            InetAddress intaddr = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(datas,datas.length,intaddr,7517);
            ds.send(dp);
            ds.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
