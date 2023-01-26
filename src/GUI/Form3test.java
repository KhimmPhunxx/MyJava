package GUI;

import javax.swing.*;
import java.awt.*;
import java.text.Normalizer;

public class Form3test extends JFrame {
    private Container c;
    private JPanel p;
    private JButton b1,b2,b3,b4,b5;

    public void initUI(){
        c=getContentPane();
        p=new JPanel();
        p.setLayout(new FlowLayout());
        b1=new JButton("One"); p.add(b1);
        b2=new JButton("Two"); p.add(b2);
        b3=new JButton("Three"); p.add(b3);
        b4=new JButton("Four"); p.add(b4);
        p.add(b5=new JButton("Five"));
        c.add(p);
    }
    public void initForm(){
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public Form3test(){
        initForm();
        initUI();
    }

    public static void main(String[] args) {
        new Form3test();
    }
}
