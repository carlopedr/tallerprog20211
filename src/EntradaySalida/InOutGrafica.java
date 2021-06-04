package EntradaySalida;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class InOutGrafica {
    public static void main(String[] Args) {
        String nombre = JOptionPane.showInputDialog("Cual es su nombre:");
        JFrame ventana = new JFrame("Mi primera ventana");
        JLabel etiqueta = new JLabel("Hola "+nombre);
        ventana.getContentPane().add(etiqueta);
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true); 

    }
}
