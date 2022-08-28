package Frame.CalculatingWindow.MenuBar.MenuFile;

import Frame.CalculatingWindow.CalculatingFrame;
import Frame.StartingWindow.StartingFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class New extends JMenuItem implements ActionListener {
    New() {
        this.setText("New");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            StartingFrame.startWindow();
            CalculatingFrame.closeWindow();
        }
    }
}
