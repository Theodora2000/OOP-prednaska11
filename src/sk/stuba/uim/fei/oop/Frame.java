package sk.stuba.uim.fei.oop;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        TestCanvas Can = new TestCanvas();
        setSize(300,300);
        setVisible(true);
        add(Can);
    }
}
