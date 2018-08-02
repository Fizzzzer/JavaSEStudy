package File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Author Fizzer
 * @Date Cretae by 2018/8/2
 * @Description: FIle类的各种方法测试
 */
public class FileMethod {

    public static void main(String[] args) {
//        getFileList();
        getFilterList();
    }

    /**
     * 获取某个文件夹下的所有文件名
     * 并删除指定的文件
     */
    public static void getFileList() {
        try {
            File mFile = new File("E:\\CodeCache");

            File[] files = mFile.listFiles();
            for(File file: files){
                if(file.getName().endsWith(".zip")){
                    file.delete();
                }
            }

//            String[] names = mFile.list();
//            for(String name : names){
//                if(name.endsWith(".jpg")){
//                    File tmp = new File("E:\\CodeCache" + File.separator + name);
//                    tmp.delete();
//                }
//            }
        } catch (Exception Ex) {

        }
    }

    /**
     * 通过文件名过滤器来筛选文件
     */
    public static void getFilterList(){
        File mFile = new File("E:\\学习视频缓存文件夹\\毕向东java基础\\java16");
        String[] names = mFile.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".zip");
            }
        });

        for(String name : names){
            System.out.println(name);
        }
    }
}
