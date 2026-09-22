
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bthirdjava {
    public static void main(String[] args) {

        BufferedReader dataln = new BufferedReader(new
                InputStreamReader(System.in));

        String name = "";
        System.out.print("Enter your name: ");
        try {
            name = dataln.readLine();
        }catch (IOException e){

        System.out.println("Error!");}
        System.out.println("Hello "+ name);

    }
}
