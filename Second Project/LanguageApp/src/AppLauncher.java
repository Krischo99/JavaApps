import guis.MainFrame;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {

        // Run App
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
