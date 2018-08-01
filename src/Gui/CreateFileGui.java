package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

/**
 * Created by Doraemon on 2018/8/1.
 * 创建一个图形化界面，输入一个文件名和文件内容，点击按钮，在cache目录下生成对应的文件
 */
public class CreateFileGui {

    private Frame mFrame;
    private TextField tf;
    private Button btn;
    private TextArea ta;

    public static void main(String[] args) {

        new CreateFileGui();
    }


    public CreateFileGui() {
        initGui();
    }

    /**
     * 初始化界面
     */
    private void initGui() {
        mFrame = new Frame("文本创建");
        mFrame.setBounds(200, 200, 500, 500);
        mFrame.setLayout(new FlowLayout());
        mFrame.addWindowListener(new MyWindowListener());

        tf = new TextField(20);

        btn = new Button("创建");

        ta = new TextArea(20, 50);

        mFrame.add(tf);
        mFrame.add(btn);
        mFrame.add(ta);

        mFrame.setVisible(true);

        setEvent();
    }

    /**
     * 设置相应事件
     */
    private void setEvent() {

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createFile();
            }
        });

        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    createFile();
                }
            }
        });
    }

    /**
     * 创建文件
     */
    private void createFile() {
        String fileName = tf.getText(); //获取文件名
        String msg = ta.getText();  //获取文本的内容

        tf.setText("");
        ta.setText("");

        String filePath = "cache" + File.separator + fileName + ".txt";
        try {
            BufferedWriter bufw = new BufferedWriter(new FileWriter(filePath));
            bufw.write(msg);
            bufw.close();
        } catch (IOException ex) {

        }
    }
}
