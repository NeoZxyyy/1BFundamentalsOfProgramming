import javax.swing.JOptionPane;

public class EvenNumbers_JOptPane {
    public static void main(String[] args) {

        int number = 2;
        String output = "";

        while (number <= 100) {

            output += number + " ";

            number += 2;

            if (number == 22 || number == 42 ||
                    number == 62 || number == 82) {

                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}