import javax.swing.*;

public class Actividad3 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 3 - Campo de texto");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(50, 50, 230, 30);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(115, 100, 100, 30);

        btnEnviar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            System.out.println("Nombre introducido: " + nombre);
        });

        ventana.add(txtNombre);
        ventana.add(btnEnviar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}