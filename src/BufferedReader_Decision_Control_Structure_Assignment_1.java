import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_Decision_Control_Structure_Assignment_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("| Leap Year or Not Leap Year |\n");

            System.out.print("Enter a year: ");
            String input = reader.readLine();
            int year = Integer.parseInt(input);

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.printf("%d is a leap year!%n", year);
            } else {
                System.out.printf("%d is not a leap year!%n", year);
            }


    }
}


