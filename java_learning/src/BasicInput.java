import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Write the value of a+b and a-b:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;

        System.out.println("Sum of a+b"+ sum+"and diff of a-b"+ diff);


    }
}
