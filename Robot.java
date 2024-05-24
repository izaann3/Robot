package Robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Robot {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Control de robot");
        JTextField pantalla = new JTextField();
        JPanel buttonsPanel = new JPanel();

        JButton endavant = new JButton("Moure Endavant");
        JButton enrere = new JButton("Moure Enrere");
        JButton esquerra = new JButton("Girar Esquerra");
        JButton dreta = new JButton("Girar Dreta");
        JButton guardar = new JButton("Guardar Estat");
        JButton carregar = new JButton("Carregar Estat");

        pantalla.setEditable(false);
        
        endavant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha movido hacia delante");
            }
        });

        enrere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha movido hacia atrás");
            }
        });

        esquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha girado a la izquierda");
            }
        });

        dreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha girado a la derecha");
            }
        });

        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha guardado el estado");
            }
        });

        carregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha cargado el estado");
            }
        });

        buttonsPanel.add(endavant);
        buttonsPanel.add(enrere);
        buttonsPanel.add(esquerra);
        buttonsPanel.add(dreta);
        buttonsPanel.add(guardar);
        buttonsPanel.add(carregar);

        frame.add(buttonsPanel);

        frame.setSize(375, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
