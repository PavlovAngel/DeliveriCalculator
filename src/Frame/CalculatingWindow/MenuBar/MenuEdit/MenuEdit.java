package Frame.CalculatingWindow.MenuBar.MenuEdit;

import javax.swing.*;

public class MenuEdit extends JMenu {
    public MenuEdit() {
        this.setText("Edit");
        this.add(new Undo());

    }
}
