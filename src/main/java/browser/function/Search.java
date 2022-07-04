package browser.function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Search implements ActionListener {

    public JTextField textField;

    public Search(JTextField textField) {
        this.textField = textField;
    }

    public void actionPerformed(ActionEvent ea) {
        String line;
        try (Socket socket = new Socket(textField.getText(), 80)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.print("GET / HTTP/1.1\r\n");
            out.print(textField.getText() + "\r\n\r\n");
            out.flush();
            while ((line = in.readLine()) != null) {

                System.out.println(line);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

