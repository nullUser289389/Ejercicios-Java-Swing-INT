import javax.swing.*;

public class Actividad4 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 4 - Nombre y Apellido");
        ventana.setSize(350, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 80, 25);
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(110, 30, 180, 25);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(30, 70, 80, 25);
        JTextField txtApellido = new JTextField();
        txtApellido.setBounds(110, 70, 180, 25);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(120, 130, 100, 30);

        btnEnviar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            System.out.println("Hola " + nombre + " " + apellido);
        });

        ventana.add(lblNombre);
        ventana.add(txtNombre);
        ventana.add(lblApellido);
        ventana.add(txtApellido);
        ventana.add(btnEnviar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}