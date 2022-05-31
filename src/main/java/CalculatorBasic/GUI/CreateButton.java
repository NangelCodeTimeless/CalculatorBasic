package CalculatorBasic.GUI;

import javax.swing.*;
import java.awt.*;

public class CreateButton extends JButton {
    public CreateButton(String text, CtrlCalculator obj) {
        setActionCommand(text);
        setText(text);
        addActionListener(obj);
        setFont(new Font("Arial", Font.BOLD, 16));
        setBackground(new Color(210, 180, 222));
        setFocusPainted(false);
        setBorderPainted(false);

        if(text.equalsIgnoreCase("")){
            setActionCommand("B");
            ClassLoader load = Thread.currentThread().getContextClassLoader();
            setIcon(new ImageIcon(load.getResource("delete.png")));
            setBorderPainted(false);
            setFocusPainted(false);
        }
    }
}
