package Gui;

import java.awt.*;

/**
 * Created by Doraemon on 2018/7/30.
 * GUI 工具类
 */
public class GUIUtils {

    /**
     * 获取电脑屏幕的高度
     * @return  hight
     */
    public static int getScreenHeight(){
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        return ds.height;
    }

    /**
     * 获取电脑屏幕的宽度
     * @return  width
     */
    public static int getScreenWidth(){
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        return ds.width;
    }
}
