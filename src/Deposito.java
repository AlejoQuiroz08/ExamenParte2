import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    public JPanel deposito;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton salirButton;

    private JButton entrarButton;
    private JButton borrarButton;
    private double saldoActual = 200.0;

    class NumericButtonListener implements ActionListener {
        private String number;

        public NumericButtonListener(String number) {
            this.number = number;
        }

        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + number);
        }
    }
    public Deposito() {
        a1Button.addActionListener(new Deposito.NumericButtonListener("1"));
        a2Button.addActionListener(new Deposito.NumericButtonListener("2"));
        a3Button.addActionListener(new Deposito.NumericButtonListener("3"));
        a4Button.addActionListener(new Deposito.NumericButtonListener("4"));
        a5Button.addActionListener(new Deposito.NumericButtonListener("5"));
        a6Button.addActionListener(new Deposito.NumericButtonListener("6"));
        a7Button.addActionListener(new Deposito.NumericButtonListener("7"));
        a8Button.addActionListener(new Deposito.NumericButtonListener("8"));
        a9Button.addActionListener(new Deposito.NumericButtonListener("9"));

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cantidad = Double.parseDouble(textField1.getText());
                saldoActual += cantidad;
                JOptionPane.showMessageDialog(deposito, "Depósito exitoso");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menuFrame = new JFrame("Menú");
                menuFrame.setContentPane(new Menu().menu1);
                menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuFrame.setUndecorated(true);
                menuFrame.setSize(400, 400);
                menuFrame.setLocationRelativeTo(null);
                menuFrame.setVisible(true);
                JFrame Deposito = (JFrame) SwingUtilities.getWindowAncestor(deposito);
                Deposito.dispose();
            }
        });
    }
}
