package Gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Doraemon on 2018/7/30.
 */
public class MyWindowListener extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.exit(0);
    }
}
