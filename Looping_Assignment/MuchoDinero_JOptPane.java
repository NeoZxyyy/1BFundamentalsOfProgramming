
import javax.swing.JOptionPane;

public class MuchoDinero_JOptPane {
    public static void main(String[] args) {

        double balance = 20000.00;
        double transaction;

        transaction = Double.parseDouble(
                JOptionPane.showInputDialog("Enter transaction amount (0 to stop):")
        );

        while (transaction != 0) {

            if (transaction > 0) {
                balance += transaction;
            }
            else if (transaction < 0) {

                if (balance >= Math.abs(transaction)) {
                    balance += transaction;
                }
                else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Outstanding Balance: P" + String.format("%.2f", balance)
            );

            transaction = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter transaction amount (0 to stop):")
            );
        }

        JOptionPane.showMessageDialog(null,
                "Transaction ended.\nFinal Balance: P" + String.format("%.2f", balance)
        );
    }
}