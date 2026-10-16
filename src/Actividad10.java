import javax.swing.*;

public class Actividad10 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Actividad 10 - JMenuBar");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraMenu = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");

        itemAbrir.addActionListener(e -> System.out.println("Opción seleccionada: Abrir"));
        itemGuardar.addActionListener(e -> System.out.println("Opción seleccionada: Guardar"));

        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);

        JMenu menuEdicion = new JMenu("Edición");

        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);

        ventana.setJMenuBar(barraMenu);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}