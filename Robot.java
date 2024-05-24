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

    }
    
    public static void main(String[] args) {

    }
}
