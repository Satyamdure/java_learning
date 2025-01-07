import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter text (type 'exit' to quit):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;

            }
            System.out.println("You entered: " + input);
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}

