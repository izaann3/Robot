package Robot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Robot {
    private static String direccion = "Norte";
    private static String direccionEnfocando = "Norte";

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
                System.out.println("El robot se ha movido hacia " + direccion);
            }
        });

        enrere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("El robot se ha movido hacia atrás");
            }
        });

        esquerra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiarDireccion("izquierda");
                System.out.println("El robot ha girado a la " + direccion);
            }
        });

        dreta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiarDireccion("derecha");
                System.out.println("El robot ha girado a la " + direccion);
            }
        });

        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha guardado el estado del robot");
            }
        });

        carregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha cargado el estado del robot");
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

    private static void cambiarDireccion(String direccionGiro) {
        if (direccionGiro.equals("izquierda")) {
            if (direccion.equals("Norte")) {
                direccion = "Oeste";
            } else if (direccion.equals("Oeste")) {
                direccion = "Sur";
            } else if (direccion.equals("Sur")) {
                direccion = "Este";
            } else if (direccion.equals("Este")) {
                direccion = "Norte";
            }
        } else if (direccionGiro.equals("derecha")) {
            if (direccion.equals("Norte")) {
                direccion = "Este";
            } else if (direccion.equals("Este")) {
                direccion = "Sur";
            } else if (direccion.equals("Sur")) {
                direccion = "Oeste";
            } else if (direccion.equals("Oeste")) {
                direccion = "Norte";
            }
        }
    }
}
