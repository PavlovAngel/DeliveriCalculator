package Frame.StartingWindow;

import Frame.CalculatingWindow.CalculatingFrame;
import Frame.CalculatingWindow.DeliveryNoteTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
            DeliveryNoteTextField.deliveryNoteTextField.setText("Delivery 2028");
            UrlTextField.urlTextField.setText("");
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
