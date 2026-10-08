import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_Decision_Control_Structure_Assignment_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Variables
        double height;
        int age;
        String citizenship;
        boolean isCitizen = false;
        String recommendee;

        System.out.println("Jedi Knight Military Academy");
        System.out.println("Are you recommendee of Jedi Master Obi Wan? (R/N)");
        System.out.println("Enter R if recommendee : N if not");
        System.out.print("Enter your choice: ");
        recommendee = reader.readLine().toUpperCase();

        switch (recommendee) {
            case "R":
                System.out.println("\nAccepted!");
                break;

            case "N":
                System.out.print("\nEnter your height in cm: ");
                height = Double.parseDouble(reader.readLine());

                System.out.print("Enter your age: ");
                age = Integer.parseInt(reader.readLine());

                System.out.println("Enter your citizenship (C/N): ");
                System.out.println("Enter C if citizen of Endor : N if not");
                System.out.print("Enter your choice: ");
                citizenship = reader.readLine().toUpperCase();

                if (citizenship.equals("C")) {
                    isCitizen = true;
                } else if (citizenship.equals("N")) {
                    isCitizen = false;
                } else {
                    System.out.println("Invalid choice.");
                    break;
                }

                System.out.println();

                if (height >= 200 && age >= 21 && age <= 25 && isCitizen) {
                    System.out.println("Accepted!");
                } else {
                    System.out.println("Rejected!");
                }
                break;

            default:
                System.out.println("Invalid choice. Try again.");
                break;
        }

        reader.close();
    }
}