package Frame.CalculatingWindow.MenuBar.MenuOptions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuOptions extends JMenu implements ActionListener {
    public MenuOptions() {
        this.setText("Options");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
