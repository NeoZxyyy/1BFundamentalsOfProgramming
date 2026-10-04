import javax.swing.JOptionPane;

public class JOptPane_Decision_Control_Structure_Assignment_3 {
    public static void main(String[] args) {

        // Variables
        double parentsSalary;
        int nsatScore;
        int entranceExamScore;
        int avg;

        parentsSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your parents salary"));
        nsatScore = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your NSAT exam score"));
        entranceExamScore = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your entrance exam score"));

        avg = (nsatScore+entranceExamScore)/2;

        if(parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85){
            JOptionPane.showMessageDialog(null, "Rejected!");
        } else if (parentsSalary <= 3500 && avg >= 91){
            JOptionPane.showMessageDialog(null, "Accepted!");
        } else {
            JOptionPane.showMessageDialog(null, "Subjected for further study!");
        }


    }
}
