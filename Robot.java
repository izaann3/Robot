package Robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Robot extends JPanel {
   public Robot() {
       setLayout(new GridLayout(4, 2));
  
       add(createButton("Moure Endavant"));
       add(createButton("Girar Esquerra"));
       add(createButton("Moure Enrere"));
       add(createButton("Girar Dreta"));
       add(createButton("Guardar Estat"));
       add(createButton("Carregar Estat"));
   }
  
   private JButton createButton(String text) {
       JButton button = new JButton(text);
       button.setPreferredSize(new Dimension(50, 30));
       return button;
   }
  
   public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Control de Robot");
        frame.setResizable(false);
        frame.add(new Robot());
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }
}





