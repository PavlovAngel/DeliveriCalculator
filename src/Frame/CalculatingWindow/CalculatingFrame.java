package Frame.CalculatingWindow;

import Frame.CalculatingWindow.MenuBar.MenuBar;

import javax.swing.*;
import java.awt.*;

public class CalculatingFrame extends JFrame {
    public static CalculatingFrame calculatingFrame;

    public CalculatingFrame() {

        TextFieldPanel textFieldPanel = new TextFieldPanel();
        Button button = new Button();

        // BoxChoiceMenu boxChoiceMenu = new BoxChoiceMenu();
        JLabel weight = new JLabel(0 + " kg");
        JLabel boxes = new JLabel("Boxes: " + 0);
        JLabel cmrBoxes = new JLabel("CMRBoxes: " + 0);
        boxes.setBounds(180, 55, 65, 20);
        cmrBoxes.setBounds(0, 55, 85, 20);
        //boxes.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
        //  weight.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,true));
        weight.setBounds(130, 55, 50, 20);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(250, 150);
        this.getContentPane().setBackground(new Color(150, 148, 148));
        this.setTitle("Shipping");
        this.setLocation(800, 100);
        this.add(weight);
        this.add(boxes);
        this.add(cmrBoxes);
        this.add(textFieldPanel);
        //  this.add(boxChoiceMenu);
        this.add(button);
        this.setJMenuBar(new MenuBar());
        this.setVisible(true);
        this.setAlwaysOnTop(true);

    }

    public static void closeWindow() {
        calculatingFrame.dispose();
    }

    public static void openWindow() {
        calculatingFrame = new CalculatingFrame();
    }
}
