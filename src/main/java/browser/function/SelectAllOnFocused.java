package browser.function;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SelectAllOnFocused implements FocusListener {

    @Override
    public void focusGained(FocusEvent fe) {
        if (!(fe.getSource() instanceof JTextField txt)) return;
        txt.selectAll();

        KeyListenerImpl key = new KeyListenerImpl();

//        if ()
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}

