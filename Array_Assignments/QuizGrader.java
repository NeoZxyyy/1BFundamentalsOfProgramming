import java.util.Scanner; // utility para sa scanner

public class QuizGrader {
    public static void main(String[] args) { // entrypoint ng JVM

        Scanner scanner = new Scanner(System.in);
    // variable lang para sa percentage ng score mnagagamit to mamaya hehe
        double scorePercentage = 0;

        // values ng answerkey at dynamic variable na student answer so para depende kung ilan ang aindex ng student answer sa length ng answer key ;)
     char []answerKey = {'A','C','B','D','A','C','C','B','A','D'};
     char []studentAnswers = new char[answerKey.length];
     int correctCount = 0;

     // for loop para sa pag sagot sa each indexes :)
     for (int j = 0; j<answerKey.length;j++){
         System.out.println("=== Question "+(j+1) + " ===");
         System.out.print("Enter answer (A,B,C,D): ");
         studentAnswers[j] = scanner.next().toUpperCase().charAt(0);
         if(studentAnswers[j]==answerKey[j]){
             System.out.println("Correct");
         } else {
             System.out.println("Incorrect, you answered "+ studentAnswers[j]+". the correct answer is "+ answerKey[j]);
         }
         System.out.println();

     }

     // for loop para ma count ang correct answers
     for (int i = 0; i<studentAnswers.length; i++){
         if (studentAnswers[i] == answerKey[i]){
             correctCount++;
         }
     }
        // para ma compute ang percentage eto ginawa ko
        double countDouble = correctCount;
        scorePercentage = (countDouble/answerKey.length) * 100;

        // nag print lang ng title at i output ang mga correct count, percentage, at if fail or pass if  more than 70%
        System.out.println("=== Quiz Grader ===");
        System.out.println("Correct Answers: " + correctCount +"/"+answerKey.length);
        System.out.println(scorePercentage+ " %");
        if  (scorePercentage >= 70){
            System.out.println("Result: Pass!");
        } else System.out.println("Result: Fail!");



        scanner.close();
    }
}
