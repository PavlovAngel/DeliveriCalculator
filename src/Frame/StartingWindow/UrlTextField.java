package Frame.StartingWindow;

import javax.swing.*;
import java.awt.*;

public class UrlTextField extends JTextField {
    public static UrlTextField urlTextField = new UrlTextField();

    UrlTextField() {
        this.setBounds(100, 100, 100, 100);
        this.setToolTipText("Enter Url!");
        this.setFont(new Font("Consolas", Font.BOLD, 18));
    }

}
