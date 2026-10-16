import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Selector de Actividades");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        String[] actividades = {
                "Actividad 1", "Actividad 2", "Actividad 3", "Actividad 4", "Actividad 5",
                "Actividad 6", "Actividad 7", "Actividad 8", "Actividad 9", "Actividad 10"
        };

        JComboBox<String> cmbActividades = new JComboBox<>(actividades);
        cmbActividades.setBounds(50, 40, 230, 30);

        JButton btnEjecutar = new JButton("Ejecutar Actividad");
        btnEjecutar.setBounds(85, 90, 160, 30);

        btnEjecutar.addActionListener(e -> {
            String seleccion = (String) cmbActividades.getSelectedItem();
            if (seleccion == null) return;

            switch (seleccion) {
                case "Actividad 1": Actividad1.main(null); break;
                case "Actividad 2": Actividad2.main(null); break;
                case "Actividad 3": Actividad3.main(null); break;
                case "Actividad 4": Actividad4.main(null); break;
                case "Actividad 5": Actividad5.main(null); break;
                case "Actividad 6": Actividad6.main(null); break;
                case "Actividad 7": Actividad7.main(null); break;
                case "Actividad 8": Actividad8.main(null); break;
                case "Actividad 9": Actividad9.main(null); break;
                case "Actividad 10": Actividad10.main(null); break;
            }
        });

        ventana.add(cmbActividades);
        ventana.add(btnEjecutar);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}