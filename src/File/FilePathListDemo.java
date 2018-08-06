package File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/8/6
 * @Description: 将指定文件中的文件路径保存起来，并写入到文件中
 */
public class FilePathListDemo {

    private static List<String> pathList = new ArrayList<>();

    public static void main(String[] args) {

        getFilePathList(new File("E:\\学习视频缓存文件夹\\毕向东java基础"));

        try {
            BufferedWriter bufw = new BufferedWriter(new FileWriter(FileUtils.getPath() + "Path.txt"));
            for(String path : pathList){
                bufw.write(path);
                bufw.newLine();
            }
            bufw.close();
        } catch (IOException Ex) {

        }
    }

    public static void getFilePathList(File mFile) {
        File[] files = mFile.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                getFilePathList(file);
            } else {
                pathList.add(file.getAbsolutePath());
            }
        }
    }
}
