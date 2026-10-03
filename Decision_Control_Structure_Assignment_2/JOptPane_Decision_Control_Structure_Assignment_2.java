import javax.swing.JOptionPane;

public class JOptPane_Decision_Control_Structure_Assignment_2 {
    public static void main(String[] args) {

        // Variables
        double hourlyRate;
        double hoursWorked;
        double grossPay;
        double taxRate;
        double withholdingTax;
        double netPay;

        // Input
        hourlyRate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your hourly rate:")
        );

        hoursWorked = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your hours worked:")
        );

        // Gross Pay computation
        grossPay = hourlyRate * hoursWorked;

        // Determine tax rate
        if (grossPay <= 2000) {
            taxRate = .10;
        } else if (grossPay <= 4000) {
            taxRate = .12;
        } else if (grossPay <= 10000) {
            taxRate = .15;
        } else {
            taxRate = .20;
        }

        // Calculate tax and net pay
        withholdingTax = grossPay * taxRate;
        netPay = grossPay - withholdingTax;

        // Output
        JOptionPane.showMessageDialog(
                null,
                "Gross Pay: ₱" + grossPay +
                        "\nWithholding Tax: ₱" + withholdingTax +
                        "\nNet Pay: ₱" + netPay
        );
    }
}