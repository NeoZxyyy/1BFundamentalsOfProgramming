import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class TenNumbers_BuufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int highest;
        int lowest;
        int number;

        System.out.print("Enter number 1: ");
        number = Integer.parseInt(reader.readLine());
        highest = number;
        lowest = number;


        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i +": ");
            number = Integer.parseInt(reader.readLine());

            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }
        System.out.println("\nHighest : " + highest);
        System.out.println("Lowest : " + lowest);


        reader.close();
    }
}
