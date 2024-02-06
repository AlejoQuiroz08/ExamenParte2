import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Saldo {
        public JPanel saldo;
        private JButton salirButton;
        private JLabel SaldoLabel;

        private double saldoActual = 200.0;

        public Saldo() {
            actualizarSaldo();

            salirButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame menuFrame = new JFrame("Menú");
                    menuFrame.setContentPane(new Menu().menu1);
                    menuFrame.setUndecorated(true);
                    menuFrame.setSize(400, 400);
                    menuFrame.setLocationRelativeTo(null);
                    menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menuFrame.setVisible(true);
                    JFrame saldoFrame = (JFrame) SwingUtilities.getWindowAncestor(saldo);
                    saldoFrame.dispose();
                }
            });
        }

        private void actualizarSaldo() {
            SaldoLabel.setText("Saldo actual: $" + saldoActual);
        }
    }
