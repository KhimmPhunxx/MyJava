package Exercise1;



import javax.swing.*;
import java.awt.*;
import java.awt.image.AbstractMultiResolutionImage;

public class TestUI extends JFrame {
    private Container c;
    private JTextField tfi,tff,tfp,tfc,tfct,tfe;
    private JRadioButton ch1,ch2;
    private ButtonGroup g;
    private JComboBox jcb;
    private JButton bta,btr;
    private JTextArea d;
    private JScrollPane jsp;

    public void initUI() {
        c = getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel());
        p1.setBackground(Color.pink);
        //c.add(p1,"North");
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(8, 2));
        p2.setBackground(Color.pink);
        p2.add(new JLabel("NAME"));
        p2.add(tfi = new JTextField(12));

        p2.add(new JLabel("GENDER"));
        p2.add(jcb = new JComboBox());
        jcb.addItem("Male");
        jcb.addItem("Female");
        jcb.setSelectedIndex(-1);


        p2.add(new JLabel("FATHER NAME"));
        p2.add(tff = new JTextField(12));


        p2.add(new JLabel("PASSWORD"));
        p2.add(tfp = new JTextField(12));

        p2.add(new JLabel("CONFIRM PASSWORD"));
        p2.add(tfc = new JTextField(12));

        p2.add(new JLabel("CITY"));
        p2.add(tfct = new JTextField(12));

        p2.add(new JLabel("EMAIL"));
        p2.add(tfe = new JTextField(12));

        //c.add(p2,"Center");
        JPanel p12 = new JPanel();
        p12.setLayout(new BorderLayout());
        p12.add(p1, "North");
        p12.add(p2, "Center");
        //c.add(p12,"North");
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.setBackground(Color.PINK);
        p3.add(bta = new JButton("REGISTER"));
        p3.add(btr = new JButton("RESET"));

        JPanel p123 = new JPanel();
        p123.setLayout(new BorderLayout());
        p123.add(p12, "North");
        p123.add(p3, "Center");
        c.add(p123, "North");
        d = new JTextArea(10, 40);
        jsp = new JScrollPane(d);
        c.add(jsp, "Center");
    }
    public void Add(){
        bta.addActionListener(e -> {

            String n = tfi.getText().toString();
            String g = jcb.getSelectedItem().toString();
            String f = tff.getText().toString();
            String p = tfp.getText().toString();
            String cf = tfc.getText().toString();
            String ct = tfct.getText().toString();
            String em = tfe.getText().toString();
            String mix = f+" "+ n;
            String report = n+"   "+g+"   "+f+"   "+p+"   "+cf+"   "+ct+"   "+em+"   "+mix+"\n";
            d.append(report);

        });

    }

    public void close(){
        btr.addActionListener(e -> {
            tfi.setText(null);
            jcb.setSelectedIndex(-1);
            tff.setText(null);
            tfp.setText(null);
            tfc.setText(null);
            tfct.setText(null);
            tfe.setText(null);
        });
    }

    public TestUI() {
        initUI();
        initForm();
        close();
        Add();
    }
    public void initForm() {
        pack();
        setTitle("Registration Form");
        getContentPane().setBackground(Color.PINK);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestUI();

    }
}

