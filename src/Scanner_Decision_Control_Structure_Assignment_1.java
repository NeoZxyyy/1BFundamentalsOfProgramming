import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Decision_Control_Structure_Assignment_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable
        int year;

        System.out.println("| Leap Year or Not Leap Year |");

        while (true) {

            System.out.print("Enter a year: ");

            try {
                year = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\nEnter a valid year!\n");
                scanner.nextLine(); // Remove invalid input
                continue;
            }

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.printf("%d is a leap year!%n", year);
            }
            else {
                System.out.printf("%d is not a leap year!%n", year);
            }

            break;
        }

        scanner.close();
    }
}