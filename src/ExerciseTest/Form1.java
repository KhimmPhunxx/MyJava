package ExerciseTest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    private Container c;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField tfc,tfn;
    private JComboBox jcb, jcb2, jcb3;
    private JRadioButton ch1,ch2;
    private ButtonGroup g;
    private JButton bta,btr;
    private JTextArea d,d2;
    private JScrollPane jsp;
    private JCheckBox cb;
//    private String[] days= {"1","2","3","4"};
//    private String[] month = {"January", "February", "March"};
//    private String[] years = {"2000","2001","2002", "2003"};

    public Form1() {
        c=getContentPane();
        c.setLayout(null);
        initUI();
        order();close();
        initForm();


    }
    public void initUI() {
        l1=new JLabel("Registration Form");
        l1.setBounds(250,10,200,40);c.add(l1);
        l2=new JLabel("Name");l2.setBounds(50,55,80,20);c.add(l2);
        tfc=new JTextField();
        tfc.setBounds(105,55,220,20); c.add(tfc);

        l3=new JLabel("Mobile");l3.setBounds(50,80,120,20);c.add(l3);
        tfn=new JTextField();
        tfn.setBounds(105,80,150,20); c.add(tfn);
        l4=new JLabel("Gender");l4.setBounds(50,105,80,20);c.add(l4);
        ch1=new JRadioButton("Male");
        ch2=new JRadioButton("Female");
        ch1.setBounds(105,105,60,20);c.add(ch1);
        ch2.setBounds(255,105,70,20);c.add(ch2);

        l5=new JLabel("DOB");
        l5.setBounds(50,130,80,20); c.add(l5);
        jcb=new JComboBox();
       jcb.setBounds(105,130,40,20);c.add(jcb);
        jcb.addItem("1");
        jcb.addItem("2");
        jcb.addItem("3");
        jcb.addItem("4");
        jcb.addItem("5");
        jcb.addItem("6");
        jcb.addItem("7");
        jcb.addItem("8");
        jcb.addItem("9");
        jcb.addItem("10");
        jcb.addItem("11");
        jcb.addItem("12");
        jcb.addItem("13");
        jcb.addItem("14");
        jcb.addItem("15");
        jcb.addItem("16");
        jcb.addItem("17");
        jcb.addItem("18");
        jcb.addItem("19");
        jcb.addItem("20");
        jcb.addItem("21");
        jcb.addItem("22");
        jcb.addItem("23");
        jcb.addItem("24");
        jcb.addItem("25");
        jcb.addItem("26");
        jcb.addItem("27");
        jcb.addItem("28");
        jcb.addItem("29");
        jcb.addItem("30");
        jcb.addItem("31");
          jcb2=new JComboBox();
          jcb2.setBounds(155,130,80,20);c.add(jcb2);
        jcb2.addItem("January");
        jcb2.addItem("February");
        jcb2.addItem("March");
        jcb2.addItem("April");
        jcb2.addItem("May");
        jcb2.addItem("June");
        jcb2.addItem("July");
        jcb2.addItem("August");
        jcb2.addItem("September");
        jcb2.addItem("October");
        jcb2.addItem("November");
        jcb2.addItem("December");
        jcb3=new JComboBox();
        jcb3.setBounds(235,130,80,20);c.add(jcb3);
        jcb3.addItem("2000");
        jcb3.addItem("2001");
        jcb3.addItem("2002");
        jcb3.addItem("2003");
        jcb3.addItem("2004");
        jcb3.addItem("2005");

        l6=new JLabel("Address");
        l6.setBounds(50,160,80,20); c.add(l6);
        d2= new JTextArea();
        jsp=new JScrollPane(d2);
        jsp.setBounds(105,160,220,60);c.add(jsp);
        cb=new JCheckBox("Accept Terms And Conditions.");
        cb.setBounds(70,230,200,20);c.add(cb);

        g=new ButtonGroup();
        g.add(ch1);g.add(ch2);
        bta=new JButton("Submit");
        btr=new JButton("Reset");
        bta.setBounds(80,265,80,20);c.add(bta);

        btr.setBounds(180,265,80,20);c.add(btr);
        d=new JTextArea();
        jsp=new JScrollPane(d);
        jsp.setBounds(340,55,400,220);c.add(jsp);

    }
    public void close() {
        btr.addActionListener(e -> {
            //d.setText(null);
            tfc.setText(null);
            tfn.setText(null);
            d2.setText(null);
            jcb.setSelectedIndex(0);
            jcb2.setSelectedIndex(0);
            jcb3.setSelectedIndex(0);
            g.clearSelection();
            cb.setSelected(false);

        });
    }
    public void order() {

        bta.addActionListener(e -> {
            String report;
            String kk= jcb.getSelectedItem().toString()+"-"+jcb2.getSelectedItem().toString()+"-"+jcb3.getSelectedItem().toString();
            String gender = "";
            String text = cb.getText();
            if(ch1.isSelected()) gender=ch1.getText();
            if(ch2.isSelected()) gender=ch2.getText();
            report = tfc.getText()+", "+tfn.getText()+", "+gender+", "+kk+", "+d2.getText()+"\n";
//            d.append(report);
            if(cb.isSelected()){
                JOptionPane.showMessageDialog(null, "Registration SuccessFul");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please Accept Terms & Conditions");
            }
            if(tfc.getText().isEmpty() && tfn.getText().isEmpty() && d2.getText().isEmpty()){
                d.setText(null);
            }
            else {
                d.append(report);
            }

        });
    }
    public void initForm() {
        setTitle("Registration Form");
        setSize(800,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Form1();

    }
}
