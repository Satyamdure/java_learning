import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        // Create the Scanner object.

        Scanner scanner = new Scanner(System.in);

        // Output

        System.out.println("Enter your marks please! ");

        //Getting user input.

        int testscore = scanner.nextInt();

        char grade;

        //Use of if statement.

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        if (grade == 'F') {
            System.out.println("Sorry! You have got 'F' grade So kindly try one more attempt.");
        } else {
            System.out.println("Congratulation you have got grade: " + grade);
        }
    }
}



