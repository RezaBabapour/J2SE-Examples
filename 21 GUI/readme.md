# GUI programming in JAVA
there is some libraries that used for applet developing, but applets are expired because of thier security isseus. these libraries are remain in JAVA and can be used for developing desktop applications.
the code in below shows a form and a button. click event is set to change the text of the button.
```
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
```
As you can see layout manager is disabled and items have their own position in form. if you want to use JAVA layout manager, you should put items in a panels.
```
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
```
