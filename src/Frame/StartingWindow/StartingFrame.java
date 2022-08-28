package Frame.StartingWindow;

import javax.swing.*;

public class StartingFrame extends JFrame {
    public static StartingFrame startingFrame;

    public StartingFrame() {
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(new Button());
        this.add(UrlTextField.urlTextField);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
    }

    public static void startWindow() {
        startingFrame = new StartingFrame();
    }

    public static void closeWindow() {
        startingFrame.dispose();
    }

}
