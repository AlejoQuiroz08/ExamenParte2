import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        JFrame form1 = new JFrame("Banco buho");
        form1.setContentPane(new form1().login);
        form1.setUndecorated(true);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
        form1.setSize(400, 400);
        form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
