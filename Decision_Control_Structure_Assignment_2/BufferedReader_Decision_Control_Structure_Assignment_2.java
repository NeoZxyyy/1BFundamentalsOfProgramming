import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Decision_Control_Structure_Assignment_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Variables
        double hourlyRate;
        double hoursWorked;
        double grossPay;
        double taxRate;
        double withholdingTax;
        double netPay;

        System.out.print("Enter your hourly rate: ");
        hourlyRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter your hours worked: ");
        hoursWorked = Double.parseDouble(reader.readLine());

        // Gross Pay computation
        grossPay = hourlyRate * hoursWorked;

        if (grossPay <= 2000) {
            taxRate = .10;
        } else if (grossPay <= 4000) {
            taxRate = .12;
        } else if (grossPay <= 10000) {
            taxRate = .15;
        } else {
            taxRate = .20;
        }

        withholdingTax = grossPay * taxRate;
        netPay = grossPay - withholdingTax;

        System.out.printf("\nGross Pay: ₱%,.2f\n", grossPay);
        System.out.printf("Withholding Tax: ₱%,.2f\n", withholdingTax);
        System.out.printf("Net Pay: ₱%,.2f\n", netPay);
    }
}