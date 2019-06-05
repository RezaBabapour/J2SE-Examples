package app;

import javax.swing.*;

public class main2 {
    public static JTextField jTextField = new JTextField(10);
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GUI Programming");
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("OK");
        jPanel.add(jButton);
        jPanel.add(jTextField);
        jFrame.add(jPanel);
        jFrame.setBounds(0, 0, 700, 700);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
