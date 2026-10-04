import java.util.Scanner;

public class Scanner_Decision_Control_Structure_Assignment_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        double parentsSalary;
        int nsatScore;
        int entranceExamScore;
        int avg;

        System.out.print("Enter your parents salary: ");
        parentsSalary = scanner.nextDouble();
        System.out.print("Enter your NSAT exam score: ");
        nsatScore = scanner.nextInt();
        System.out.print("Enter your entrance exam score: ");
        entranceExamScore = scanner.nextInt();
        System.out.println();


        avg = (nsatScore + entranceExamScore) / 2;


        if(parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85){
            System.out.println("Rejected!");
        } else if (parentsSalary <= 3500 && avg >= 91){
            System.out.println("Accepted!");
        } else {
            System.out.println("Subjected for further study!");
        }

        scanner.close();
    }
}
