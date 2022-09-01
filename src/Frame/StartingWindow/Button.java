package Frame.StartingWindow;

import Frame.CalculatingWindow.CalculatingFrame;
import Frame.CalculatingWindow.DeliveryNoteTextField;
import Web.User;
import Web.WebSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Button extends JButton implements ActionListener, KeyListener {
    public static Button button = new Button();

    Button() {
        this.setText("Click");
        this.setSize(98, 73);
        this.setLocation(297, -2);
        this.setBorderPainted(true);
        this.setBackground(new Color(218, 218, 218));
        this.setForeground(new Color(0, 0, 0));
        this.setFocusable(false);
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            StartingFrame.closeWindow();
            CalculatingFrame.openWindow();
            try {
                User.loginToSite();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            WebSite.deliveryNoteUrl = UrlTextField.urlTextField.getText();
            DeliveryNoteTextField.deliveryNoteTextField.setText(User.site.getDocument()
                    .getElementsByClass("mdc-layout-grid__cell mdc-layout-grid__cell--span-12-desktop mdc-layout-grid__cell--span-8-tablet")
                    .text());
            UrlTextField.urlTextField.setText("");
            // TODO: 8/28/2022 Set delivery note number to delivery text field
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
