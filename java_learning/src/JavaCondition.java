import java.util.Scanner;

public class JavaCondition {
    public static void main(String[] args) {
        System.out.println("Voting eligibility");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age please!");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Now you are eligible for the Voting");

        }
        else {
            System.out.println("Sorry! your are not eligible for the Voting");

        }




    }
}
