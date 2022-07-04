package browser.function;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerImpl implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        //키가 문자를 입력할 때
    }

    @Override
    public void keyPressed(KeyEvent e) {
            System.out.println("key pressed :" + e.getKeyCode());

        //키 눌를때
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //키 놓을때
    }

}
