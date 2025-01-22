// Code for factorial finding

import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {

        // Creating Scanner object

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive integer number");

        // Getting user input to find factorial
        int num = sc.nextInt();

        long factorial = num;

        for(int i = num -1; i>0 ; i--) {

            factorial = factorial * i;

           // System.out.println(factorial);
        }
       System.out.println("Factorial of "+num+ " = " + factorial);

    }
}
