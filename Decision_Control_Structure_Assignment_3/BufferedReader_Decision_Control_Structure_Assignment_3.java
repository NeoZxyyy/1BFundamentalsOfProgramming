import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Decision_Control_Structure_Assignment_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Variables
        double parentsSalary;
        int nsatScore;
        int entranceExamScore;
        double avg;

        System.out.print("Enter your parents salary: ");
        parentsSalary = Double.parseDouble(reader.readLine());

        System.out.print("Enter your NSAT exam score: ");
        nsatScore = Integer.parseInt(reader.readLine());

        System.out.print("Enter your entrance exam score: ");
        entranceExamScore = Integer.parseInt(reader.readLine());

        System.out.println();

        avg = (nsatScore + entranceExamScore) / 2.0;

        if (parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85) {
            System.out.println("Rejected!");
        } else if (parentsSalary <= 3500 && avg >= 91) {
            System.out.println("Accepted!");
        } else {
            System.out.println("Subjected for further study!");
        }

        reader.close();
    }
}