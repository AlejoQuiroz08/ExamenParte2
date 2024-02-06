import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class form1 {
    public JPanel login;
    private JPasswordField passwordField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton entrarButton;
    private JButton borrarButton;
    private JButton salirButton;
    private JButton a0Button;

    public form1() {
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

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField1.setText("");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(login, "Gracias por usar nuestros servicios");
                System.exit(0);
            }
        });
        entrarButton.addActionListener(e -> {
            char[] password = passwordField1.getPassword();
            String passwordString = new String(password);
            String contra = passwordString;
            try {
                if (contra.equals("1234")) {
                    JFrame menuFrame = new JFrame("Menú");
                    menuFrame.setContentPane(new Menu().menu1);
                    menuFrame.setUndecorated(true);
                    menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menuFrame.setSize(400, 400);
                    menuFrame.setLocationRelativeTo(null);
                    menuFrame.setVisible(true);
                    JFrame form1 = (JFrame) SwingUtilities.getWindowAncestor(login);
                    form1.dispose();
                } else {
                    MensajeEmergente.mostrarMensaje(login, "Contraseña incorrecta");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        });
    }

    class NumericButtonListener implements ActionListener {
        private String number;

        public NumericButtonListener(String number) {
            this.number = number;
        }

        public void actionPerformed(ActionEvent e) {
            passwordField1.setText(passwordField1.getText() + number);
        }
    }

}