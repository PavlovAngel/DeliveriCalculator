package Frame.StartingWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UrlTextField extends JTextField implements MouseListener {
    public static UrlTextField urlTextField = new UrlTextField();

    UrlTextField() {
        this.setBounds(-2, -1, 300, 68);
        this.setBackground(new Color(191, 191, 191));
        this.setToolTipText("Enter Url!");
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setText("Enter URL here");
        this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        urlTextField.setText("");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

