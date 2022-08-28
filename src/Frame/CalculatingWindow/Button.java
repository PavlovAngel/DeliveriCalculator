package Frame.CalculatingWindow;


import Web.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Button extends JButton implements ActionListener {

    Button() {
        this.setText("Click");
        this.setSize(90, 51);
        this.setLocation(150, -1);
        this.setBorderPainted(true);
        this.setBackground(new Color(255, 255, 255));
        this.setForeground(new Color(0, 0, 0));
        this.setFocusable(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            try {
                User.loginToSite();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            User.printHtml();

        }
    }
}