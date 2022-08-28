package Frame.StartingWindow;

import Frame.StartingWindow.MenuBar.File;

import javax.swing.*;

public class StartingFrame extends JFrame {
    public static StartingFrame startingFrame;

    public StartingFrame() {
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(new Button());
        this.add(new File());
    }

    public static void startWindow() {
        startingFrame = new StartingFrame();
    }

    public static void closeWindow() {
        startingFrame.dispose();
    }

}
