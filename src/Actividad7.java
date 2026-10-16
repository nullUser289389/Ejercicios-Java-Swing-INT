import javax.swing.*;

public class Actividad7 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 7 - JPasswordField");
        ventana.setSize(350, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(110, 30, 180, 25);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(30, 70, 80, 25);
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(110, 70, 180, 25);

        JButton btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBounds(100, 130, 130, 30);

        btnLogin.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String password = new String(txtPassword.getPassword());
            System.out.println("Usuario: " + usuario + " | Contraseña: " + password);
        });

        ventana.add(lblUsuario);
        ventana.add(txtUsuario);
        ventana.add(lblPassword);
        ventana.add(txtPassword);
        ventana.add(btnLogin);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}