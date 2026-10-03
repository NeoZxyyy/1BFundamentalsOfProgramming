import javax.swing.JOptionPane;

public class JOptPane_Decision_Control_Structure_Assignment_1 {

    public static void main(String[] args) {

        // Variable
        int year;

        JOptionPane.showMessageDialog(
                null,
                "| Leap Year or Not Leap Year |"
        );

        String input = JOptionPane.showInputDialog(
                null,
                "Enter a year:"
        );

        year = Integer.parseInt(input);

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            JOptionPane.showMessageDialog(
                    null,
                    year + " is a leap year!"
            );
        }
        else {
            JOptionPane.showMessageDialog(
                    null,
                    year + " is not a leap year!"
            );
        }
    }
}