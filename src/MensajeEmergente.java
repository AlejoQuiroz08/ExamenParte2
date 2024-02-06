import javax.swing.*;

public class MensajeEmergente {
    public static void mostrarMensaje(JPanel parentComponent, String mensaje) {
        JOptionPane.showMessageDialog(parentComponent, mensaje);
    }
}
