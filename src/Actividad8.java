import javax.swing.*;

public class Actividad8 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 8 - RadioButtons");
        ventana.setSize(300, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JRadioButton rbTarjeta = new JRadioButton("Tarjeta de Crédito");
        rbTarjeta.setBounds(50, 30, 180, 25);
        JRadioButton rbPaypal = new JRadioButton("PayPal");
        rbPaypal.setBounds(50, 60, 180, 25);
        JRadioButton rbTransferencia = new JRadioButton("Transferencia Bancaria");
        rbTransferencia.setBounds(50, 90, 180, 25);

        ButtonGroup grupoPagos = new ButtonGroup();
        grupoPagos.add(rbTarjeta);
        grupoPagos.add(rbPaypal);
        grupoPagos.add(rbTransferencia);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(90, 140, 100, 30);

        btnConfirmar.addActionListener(e -> {
            String opcion = "";
            if (rbTarjeta.isSelected()) opcion = "Tarjeta de Crédito";
            else if (rbPaypal.isSelected()) opcion = "PayPal";
            else if (rbTransferencia.isSelected()) opcion = "Transferencia Bancaria";

            System.out.println("Opción seleccionada: " + opcion);
        });

        ventana.add(rbTarjeta);
        ventana.add(rbPaypal);
        ventana.add(rbTransferencia);
        ventana.add(btnConfirmar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}