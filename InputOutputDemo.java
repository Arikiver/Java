import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            // Getting user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Printing user input
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } finally {
            if (scanner != null) {
                scanner.close(); //manually closing the scanner to avoid Resource Leaks
            }
        }
    }
}
