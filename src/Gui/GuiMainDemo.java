package Gui;

import java.awt.*;

/**
 * Created by Doraemon on 2018/7/26.
 * GUI图形化界面的主窗口，测试代码都在这里进行调试
 */
public class GuiMainDemo {
    public static void main(String[] args) {
        Frame mFrame = new Frame("Fizzer");

        mFrame.setSize(100,100);
        mFrame.setLocation(Window.WIDTH / 2,Window.HEIGHT / 2);

        mFrame.setVisible(true);
    }


}
