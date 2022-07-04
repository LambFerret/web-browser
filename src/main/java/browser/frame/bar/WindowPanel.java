package browser.frame.bar;

import javax.swing.*;
import java.awt.*;

public class WindowPanel extends JPanel {
        public JPanel windowPanel;

        public JEditorPane windowPane;
    public JScrollPane windowScroll;

    public WindowPanel() {
        windowPane = new JEditorPane();
        windowPane.setContentType("text/html");
        windowPane.setEditable(false);
        windowPanel = new JPanel(new BorderLayout());
        windowScroll = new JScrollPane(windowPane);
        windowPanel.add(windowScroll);
    }
}
