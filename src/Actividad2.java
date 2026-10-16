import javax.swing.*;

public class Actividad2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 2 - Botones");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 70, 100, 30);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(180, 70, 100, 30);

        btnAceptar.addActionListener(e -> System.out.println("Aceptado"));
        btnCancelar.addActionListener(e -> System.out.println("Cancelado"));

        ventana.add(btnAceptar);
        ventana.add(btnCancelar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}