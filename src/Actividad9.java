import javax.swing.*;

public class Actividad9 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 9 - CheckBox");
        ventana.setSize(300, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JCheckBox chkQueso = new JCheckBox("Queso Extra");
        chkQueso.setBounds(50, 30, 180, 25);
        JCheckBox chkPepperoni = new JCheckBox("Pepperoni");
        chkPepperoni.setBounds(50, 60, 180, 25);
        JCheckBox chkAceitunas = new JCheckBox("Aceitunas");
        chkAceitunas.setBounds(50, 90, 180, 25);

        JButton btnOrdenar = new JButton("Ordenar");
        btnOrdenar.setBounds(90, 140, 100, 30);

        btnOrdenar.addActionListener(e -> {
            String toppings = "Toppings seleccionados: ";
            if (chkQueso.isSelected()) toppings += "Queso Extra ";
            if (chkPepperoni.isSelected()) toppings += "Pepperoni ";
            if (chkAceitunas.isSelected()) toppings += "Aceitunas ";

            System.out.println(toppings);
        });

        ventana.add(chkQueso);
        ventana.add(chkPepperoni);
        ventana.add(chkAceitunas);
        ventana.add(btnOrdenar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}