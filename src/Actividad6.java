import javax.swing.*;

public class Actividad6 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 6 - JComboBox");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        String[] colores = {"Rojo", "Verde", "Azul"};
        JComboBox<String> cmbColores = new JComboBox<>(colores);
        cmbColores.setBounds(75, 60, 130, 30);

        cmbColores.addActionListener(e -> {
            String colorSeleccionado = (String) cmbColores.getSelectedItem();
            System.out.println("Color seleccionado: " + colorSeleccionado);
        });

        ventana.add(cmbColores);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}