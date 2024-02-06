import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro {
    public JPanel retiro;
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
    private JButton a0Button;

    class NumericButtonListener implements ActionListener {
        private String number;

        public NumericButtonListener(String number) {
            this.number = number;
        }

        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + number);
        }
    }

    public Retiro() {
        a1Button.addActionListener(new NumericButtonListener("1"));
        a2Button.addActionListener(new NumericButtonListener("2"));
        a3Button.addActionListener(new NumericButtonListener("3"));
        a4Button.addActionListener(new NumericButtonListener("4"));
        a5Button.addActionListener(new NumericButtonListener("5"));
        a6Button.addActionListener(new NumericButtonListener("6"));
        a7Button.addActionListener(new NumericButtonListener("7"));
        a8Button.addActionListener(new NumericButtonListener("8"));
        a9Button.addActionListener(new NumericButtonListener("9"));
        a0Button.addActionListener(new NumericButtonListener("0"));

        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cantidad = Double.parseDouble(textField1.getText());
                if (cantidad <=  Saldo.saldoActual) {
                    Saldo.saldoActual -= cantidad;
                    JOptionPane.showMessageDialog(retiro, "Retiro exitoso");
                } else {
                    JOptionPane.showMessageDialog(retiro, "Saldo insuficiente");
                }
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });



        class NumericButtonListener implements ActionListener {
            private String number;

            public NumericButtonListener(String number) {
                this.number = number;
            }

            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + number);
            }
        }
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menuFrame = new JFrame("Menú");
                menuFrame.setContentPane(new Menu().menu1);
                menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuFrame.setSize(400, 400);
                menuFrame.setUndecorated(true);
                menuFrame.setLocationRelativeTo(null);
                menuFrame.setVisible(true);
                JFrame Retiro = (JFrame) SwingUtilities.getWindowAncestor(retiro);
                Retiro.dispose();
            }
        });
    }
}
