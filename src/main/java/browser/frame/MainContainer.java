package browser.frame;

import browser.frame.bar.AdressBar;
import browser.frame.bar.WindowPanel;

import javax.swing.*;
import java.awt.*;

public class MainContainer extends JFrame {


    public MainContainer() {

        // Create Main Container
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        // Create Inner Panels
        JPanel addressPanel = new AdressBar().addressPanel;
        JPanel windowPanel = new WindowPanel().windowPanel;
        pane.add(addressPanel, BorderLayout.NORTH);
        pane.add(windowPanel, BorderLayout.CENTER);

        // Container Settings
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}