package Robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Robot {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JPanel panel = new JPanel(new GridLayout(4, 3));
        JTextField pantalla = new JTextField();
        JButton[] numericButtons = new JButton[10];

        for (int i = 0; i < numericButtons.length; i++){
            numericButtons[i] = new JButton(Integer.toString(i));
            panel.add(numericButtons[i]);
        }

        pantalla.setEditable(false);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.add(pantalla);
        for (JButton jButton : numericButtons) {
            frame.add(jButton);
            
        }
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
