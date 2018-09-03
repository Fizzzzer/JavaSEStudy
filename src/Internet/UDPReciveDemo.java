package Internet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/9/3
 * @Description:
 */
public class UDPReciveDemo {

    public static void main(String[] args) {
        receiveData();
    }

    public static void receiveData() {
        try {
            DatagramSocket ds = new DatagramSocket(7517);

            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data, data.length);

            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            String dataStr = new String(dp.getData(), 0, dp.getLength());

            System.out.println("dp = " + ip + " data = " + dataStr);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
