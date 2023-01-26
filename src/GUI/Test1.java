package GUI;

import javax.swing.*;
import java.util.concurrent.ForkJoinPool;

public class Test1 {
    private JFrame f;

    public Test1(){
        f = new JFrame("Employee Form");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Test1();
    }
}
