import java.util.Scanner;
import java.util.InputMismatchException;


public class bfifthjava {
    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Variable
        String name;
        int age;

        try {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            System.out.printf("Your name is %s and you are %d years old.", name, age);
        }  catch (InputMismatchException e) {
            System.out.println("Error: Age must be a whole number.");
        } finally {
            scanner.close();
        }
    }
}
