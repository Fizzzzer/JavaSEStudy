package Gui;

import java.awt.*;

/**
 * Created by Doraemon on 2018/8/6.
 * 菜单Demo
 */
public class MenuDemo {

    private Frame mFrame;
    private MenuBar mMenuBar;
    private Menu mMenu;
    private MenuItem mMenuItem;

    public static void main(String[] args){
        new MenuDemo();

    }

    public MenuDemo() {
        initWindow();
    }

    private void initWindow(){
        mFrame = new Frame("菜单Demo");
        mFrame.setBounds((GUIUtils.getScreenWidth() - 600)/2,(GUIUtils.getScreenHeight()- 600) /2,600,600);
        mFrame.setLayout(new FlowLayout());

        mMenuBar = new MenuBar();

        mMenu = new Menu("File");

        mMenuItem = new MenuItem("Fizzer");

        mMenu.add(mMenuItem);

        mMenuBar.add(mMenu);

        mFrame.setMenuBar(mMenuBar);

        mFrame.addWindowListener(new MyWindowListener());

        mFrame.setVisible(true);
    }

}
