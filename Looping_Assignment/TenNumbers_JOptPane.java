import javax.swing.JOptionPane;

public class TenNumbers_JOptPane {
    public static void main(String[] args) {

        int number;
        int highest;
        int lowest;

        number = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number 1:")
        );

        highest = number;
        lowest = number;

        for (int i = 2; i <= 10; i++) {

            number = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number " + i + ":")
            );

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest +
                        "\nLowest number: " + lowest
        );
    }
}