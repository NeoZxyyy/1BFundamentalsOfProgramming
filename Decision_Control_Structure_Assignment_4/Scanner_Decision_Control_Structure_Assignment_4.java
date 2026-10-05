import java.util.Scanner;

public class Scanner_Decision_Control_Structure_Assignment_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Variable
        double height;
        int age;
        boolean citizenVerify;
        boolean isCitizen;
        String recommendee;


        System.out.println("Jedi Knight Military Academy");
        System.out.println("Are you recommendee of Jedi Master Obi Wan? (R/N)");
        System.out.println("Enter R if recommendee : N if not");
        System.out.print("Enter your choice: ");
        recommendee = scanner.nextLine().toUpperCase();
        switch (recommendee) {
            case "R":
                System.out.println("\nAccepted!");
                break;

            case "N": System.out.print("\nEnter your height in cm: ");
                height = scanner.nextDouble();
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                System.out.println("Enter your citizenship (true/false): ");
                System.out.println("Enter True if citizen of Endor : False if not");
                System.out.print("Enter your choice: ");
                citizenVerify = scanner.nextBoolean();
                if(citizenVerify){
                    isCitizen = true;
                } else{
                    isCitizen = false;
                }

                System.out.println();
                if (height >= 200 && age >= 21 && age <= 25 && isCitizen){
                    System.out.println("Accepted!");
                    break;
                } else {
                    System.out.println("Rejected!");
                    break;
                }



            default:
                System.out.println("Invalid choice. Try again");
                break;
        }

















        scanner.close();
    }
}
