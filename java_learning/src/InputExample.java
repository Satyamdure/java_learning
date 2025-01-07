import java.util.Scanner;

public class InputExample {


    public static void main(String[] args) {

        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);

        System.out.println("Fill the value of A:");
        int a = sc.nextInt();
        System.out.println("Fill the value of B:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of two number is:"+ sum);

        System.out.println("Enter your name");
        String name = sc.next();

        // Print the entered name
        System.out.println("Hello, " + name +" jee"+ "! Welcome to Java Class");




    }
}
