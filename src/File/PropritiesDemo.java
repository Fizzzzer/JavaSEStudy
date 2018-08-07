package File;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/8/7
 * @Description:
 */
public class PropritiesDemo {

    public static void main(String[] args) throws IOException {
        Properties pop = new Properties();
        pop.load(new FileReader(FileUtils.getPath() + "Proprities.txt"));
        pop.setProperty("Fizzer","555");
        pop.setProperty("马倩倩","1");
        pop.setProperty("马倩倩1","1");

        FileOutputStream fos = new FileOutputStream(FileUtils.getPath() + "Proprities.txt");
        System.setOut(new PrintStream(fos));
        pop.list(System.out);
    }
}
