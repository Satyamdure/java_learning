import java.util.Scanner;

public class Chief {
    public static void main(String[] args) {
        // Creating Scanner object.
        Scanner sc = new Scanner(System.in);
        Chief chief = new Chief();

        // Getting user input
        System.out.println("Enter the first number:");
        int i1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int i2 = sc.nextInt();

        chief.programExacutor(i1,i2);
        System.out.println("Thank You...");
    }

    void programExacutor(int i1,int i2){
       this.addition(i1, i2);
       this.substruction(i1, i2);
       this.multiplication(i1, i2);
       this.division(i1, i2);
    }

    void addition(int a, int b) {
        System.out.println("...Starting Addition block...");
        int c = a + b;
        System.out.println("Result of a and b is " + c);
        System.out.println("...Completed Addition block...\n");

    }

    void substruction(int a, int b) {
        System.out.println("...Starting Substuction block...");
        int c = a - b;
        System.out.println("Result of a and b is " + c);
        System.out.println("...Completed Substuction block...\n");

    }

    void multiplication(int a, int b) {
        System.out.println("...Starting multiplication block...");
        int c = a * b;
        System.out.println("Result of a and b is " + c);
        System.out.println("...Completed multiplication block...\n");
    }

    void division(int a, int b) {
        System.out.println("...Starting division block...");
        float c = (float)a / b;
        System.out.println("Result of a and b is " + c);
        System.out.println("...Completed division block...");
    }
}


