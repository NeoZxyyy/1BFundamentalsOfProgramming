import javax.swing.JOptionPane;

public class JOptPane_Decision_Control_Structure_Assignment_4 {
    public static void main(String[] args) {

        // Variables
        double height;
        int age;
        String citizenship;
        boolean isCitizen = false;
        String recommendee;

        JOptionPane.showMessageDialog(null, "Jedi Knight Military Academy");

        recommendee = JOptionPane.showInputDialog(
                "Are you recommendee of Jedi Master Obi Wan? (R/N)\n" +
                        "Enter R if recommendee : N if not"
        ).toUpperCase();

        switch (recommendee) {
            case "R":
                JOptionPane.showMessageDialog(null, "Accepted!");
                break;

            case "N":
                height = Double.parseDouble(
                        JOptionPane.showInputDialog("Enter your height in cm:")
                );

                age = Integer.parseInt(
                        JOptionPane.showInputDialog("Enter your age:")
                );

                citizenship = JOptionPane.showInputDialog(
                        "Enter your citizenship (C/N):\n" +
                                "Enter C if citizen of Endor : N if not"
                ).toUpperCase();

                if (citizenship.equals("C")) {
                    isCitizen = true;
                } else if (citizenship.equals("N")) {
                    isCitizen = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid choice.");
                    break;
                }

                if (height >= 200 && age >= 21 && age <= 25 && isCitizen) {
                    JOptionPane.showMessageDialog(null, "Accepted!");
                } else {
                    JOptionPane.showMessageDialog(null, "Rejected!");
                }
                break;

            default:
                JOptionPane.showMessageDialog(
                        null, "Invalid choice. Try again."
                );
                break;
        }
    }
}