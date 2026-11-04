import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MuchoDinero_BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        double balance = 20000.00;
        double transaction;

        System.out.print("Enter transaction amount (0 to stop): ");
        transaction = Double.parseDouble(input.readLine());

        while (transaction != 0) {

            if (transaction > 0) {
                balance += transaction;
            }
            else if (transaction < 0) {

                if (balance >= Math.abs(transaction)) {
                    balance += transaction;
                }
                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.printf("Outstanding Balance: P%.2f%n", balance);

            System.out.print("Enter transaction amount (0 to stop): ");
            transaction = Double.parseDouble(input.readLine());
        }

        System.out.printf("Transaction ended.%nFinal Balance: P%.2f%n", balance);

        input.close();
    }
}