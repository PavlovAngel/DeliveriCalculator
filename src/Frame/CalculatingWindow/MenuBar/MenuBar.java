package Frame.CalculatingWindow.MenuBar;

import Frame.CalculatingWindow.MenuBar.MenuEdit.MenuEdit;
import Frame.CalculatingWindow.MenuBar.MenuFile.MenuFile;
import Frame.CalculatingWindow.MenuBar.MenuHelp.MenuHelp;
import Frame.CalculatingWindow.MenuBar.MenuOptions.MenuOptions;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        MenuFile menuFile = new MenuFile();
        MenuEdit menuEdit = new MenuEdit();
        MenuOptions menuOptions = new MenuOptions();
        MenuHelp menuHelp = new MenuHelp();
        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuOptions);
        this.add(menuHelp);
        this.setBackground(new Color(255, 255, 255));
    }
}
