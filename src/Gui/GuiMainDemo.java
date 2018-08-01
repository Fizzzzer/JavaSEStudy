package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Doraemon on 2018/7/26.
 * GUI图形化界面的主窗口，测试代码都在这里进行调试
 */
public class GuiMainDemo {
    public static void main(String[] args) {
        Frame mFrame = new Frame("Fizzer");

        mFrame.setSize(100, 100);
        mFrame.setLocation(GUIUtils.getScreenWidth() / 2, GUIUtils.getScreenHeight() / 2);
        mFrame.setLayout(new FlowLayout());

        mFrame.addWindowListener(new MyWindowListener());
        Button btn = new Button();
        btn.setLabel("Fizzer");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });

        mFrame.add(btn);
        mFrame.setVisible(true);
    }


}
