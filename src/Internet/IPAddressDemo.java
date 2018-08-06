package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doraemon on 2018/8/6.
 * IP地址Demo
 */
public class IPAddressDemo {

    public static void main(String[] args) {
        List<String> name = getHostAddress("www.dahuobaoxian.com");
        for (String host : name) {
            System.out.println(host);
        }
    }

    private static List<String> getHostAddress(String hostName) {
        List<String> hostAddr = new ArrayList<>();
        try {
            InetAddress[] ia = InetAddress.getAllByName(hostName);
            for (InetAddress addr : ia) {
                hostAddr.add(addr.getHostAddress());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostAddr;
    }
}
