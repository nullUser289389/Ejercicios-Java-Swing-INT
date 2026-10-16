import javax.swing.*;

public class Actividad5 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 5 - JOptionPane");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JButton btnEdad = new JButton("Ingresar Edad");
        btnEdad.setBounds(75, 75, 130, 30);

        btnEdad.addActionListener(e -> {
            String edad = JOptionPane.showInputDialog(ventana, "Por favor, ingresa tu edad:");
            if (edad != null && !edad.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "La edad ingresada es: " + edad);
            }
        });

        ventana.add(btnEdad);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}