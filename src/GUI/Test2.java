package GUI;

import javax.swing.*;

public class Test2 extends JFrame {
    public Test2(){
        setTitle("This My Form");
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
