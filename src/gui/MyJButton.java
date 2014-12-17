package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;


public class MyJButton extends JButton {

    public MyJButton() {
    }

    public MyJButton(String text) {
        super(text);
        setFont(new Font("Garamond", Font.PLAIN, 20));
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        
        
    }
    
    
}
