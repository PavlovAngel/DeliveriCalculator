package Frame.StartingWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UrlTextField extends JTextField implements MouseListener, KeyListener {
    public static UrlTextField urlTextField = new UrlTextField();

    UrlTextField() {
        this.setBounds(-2, -1, 300, 68);
        this.setBackground(new Color(191, 191, 191));
        this.setToolTipText("Enter Url!");
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setText("Enter URL here");
        this.addMouseListener(this);
        this.addKeyListener(this);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        urlTextField.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

