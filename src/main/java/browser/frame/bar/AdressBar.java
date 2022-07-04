package browser.frame.bar;

import browser.function.Search;
import browser.function.SelectAllOnFocused;

import javax.swing.*;
import java.awt.*;

public class AdressBar extends JPanel{
    public JTextField textField;
    public JPanel addressPanel;
    public JLabel addressLabel;
    public JButton addressButton;

    public AdressBar() {
        addressLabel = new JLabel(" address: ", SwingConstants.CENTER);
        textField = new JTextField("Enter a web address..");
        Search search = new Search(textField);
        textField.addActionListener(search);
        SelectAllOnFocused fe = new SelectAllOnFocused();
        textField.addFocusListener(fe);

        addressButton = new JButton("Go");
        addressButton.addActionListener(search);
        addressPanel = new JPanel(new BorderLayout());
        addressPanel.add(addressLabel, BorderLayout.WEST);
        addressPanel.add(textField, BorderLayout.CENTER);
        addressPanel.add(addressButton, BorderLayout.EAST);
    }
}
