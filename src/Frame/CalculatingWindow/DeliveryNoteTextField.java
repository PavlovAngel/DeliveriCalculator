package Frame.CalculatingWindow;

import javax.swing.*;
import java.awt.*;

public class DeliveryNoteTextField extends JTextField {
    public static DeliveryNoteTextField deliveryNoteTextField = new DeliveryNoteTextField();

    DeliveryNoteTextField() {
        setBounds(0, 0, 150, 50);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);

    }


}