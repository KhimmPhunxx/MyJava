package GUI3;

import javax.swing.*;
import java.awt.*;

public class Employee extends JFrame {
    private Container c;
    private JTextField tfi,tfn,tfh;
    private JRadioButton ch1,ch2;
    private ButtonGroup g;
    private JComboBox jcb;
    public void initUI(){
        c=getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Employee Form"));
        c.add(p1,"North");
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(5,2));
        p2.add(new JLabel("ID"));
        p2.add(tfi=new JTextField(12));

        p2.add(new JLabel("Name"));
        p2.add(tfn=new JTextField(12));

        p2.add(new JLabel("Gender"));
        JPanel pg = new JPanel();
        pg.setLayout(new FlowLayout());
        pg.add(ch1 = new JRadioButton("Male"));
        pg.add(ch2= new JRadioButton("Female"));

    }
    public Employee(){
        initForm();
        initUI();
    }
    public void initForm(){
        pack();
        setSize(300,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Employee();
    }
}

