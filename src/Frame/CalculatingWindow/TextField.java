package Frame.CalculatingWindow;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {
    public boolean isWrite = false;

    TextField() {
        this.setPreferredSize(new Dimension(156, 50));
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setToolTipText("Enter Url!");


    }


}