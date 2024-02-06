import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JPanel menu1;
    private JRadioButton salirRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton saldoRadioButton;

    public Menu() {
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(menu1, "Gracias por usar nuestros servicios");

                System.exit(0);

            }
        });

        saldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame saldoFrame = new JFrame("Saldo");
                saldoFrame.setContentPane(new Saldo().saldo);
                saldoFrame.setUndecorated(true);
                saldoFrame.setSize(400, 400);
                saldoFrame.setLocationRelativeTo(null);
                saldoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                saldoFrame.setVisible(true);
                JFrame menuFrame = (JFrame) SwingUtilities.getWindowAncestor(menu1);
                menuFrame.dispose();

            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame depositoFrame = new JFrame("Depósito");
                depositoFrame.setContentPane(new Deposito().deposito);
                depositoFrame.setUndecorated(true);
                depositoFrame.setSize(400, 400);
                depositoFrame.setLocationRelativeTo(null);
                depositoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                depositoFrame.setVisible(true);
                JFrame menuFrame = (JFrame) SwingUtilities.getWindowAncestor(menu1);
                menuFrame.dispose();
            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame retiroFrame = new JFrame("Retiro");
                retiroFrame.setContentPane(new Retiro().retiro);
                retiroFrame.setUndecorated(true);
                retiroFrame.setSize(400, 400);
                retiroFrame.setLocationRelativeTo(null);
                retiroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                retiroFrame.setVisible(true);
                JFrame menuFrame = (JFrame) SwingUtilities.getWindowAncestor(menu1);
                menuFrame.dispose();
            }
        });
    }
}

