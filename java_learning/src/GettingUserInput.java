import java.util.Scanner;
public class GettingUserInput {
    public static void main(String[] args) {

        // To Create Scanner Object.

        Scanner input = new Scanner(System.in);

        // Output.
        System.out.println("Enter the decimal value please!");

        // Getting input from user

        double value = input.nextDouble();

        // Said to what's you entered.

        System.out.println("you entered the decimal value: "+ value);
        System.out.println("Thank you");


    }
}
