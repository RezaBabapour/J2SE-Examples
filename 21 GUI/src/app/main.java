package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("GUI programming");
        jFrame.setBounds(0, 0, 700, 700);
        jFrame.setLayout(null);
        JTextField jTextField = new JTextField(10);
        jTextField.setBounds(300, 0, 300, 100);
        jFrame.add(jTextField);
        JButton jButton = new JButton("ok");
        jButton.setBounds(0, 0, 300, 100);
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText("button clicked");
            }
        });
        jFrame.setVisible(true);
    }
}
