package GUI2;

import GUI.Test2;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    private JPanel p;
    private Container c;
    private JButton b1,b2,b3,b4,b5;
    public void initUI(){
        c=getContentPane();
        p= new JPanel();
        p.setLayout(new BorderLayout());
        b1=new JButton("North"); p.add(b1,"North");
        b2=new JButton("South"); p.add(b2,"West");
        b3=new JButton("East"); p.add(b3,"East");
        /*b4=new JButton("West"); p.add(b4,"West");
        b5=new JButton("Center"); p.add(b5,"Center");
        c.add(p);*/
        c.add(p);
    }
    public void initForm(){
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public Test1(){
        initForm();
        initUI();

    }

    public static void main(String[] args) {
        new Test1();
    }
}
