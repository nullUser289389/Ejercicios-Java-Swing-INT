import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad1 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 1 - Ventana Básica");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // Diseño libre para colocar elementos por coordenadas

        JButton boton = new JButton("Presionar");
        boton.setBounds(90, 70, 100, 30);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón presionado!");
            }
        });

        ventana.add(boton);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}