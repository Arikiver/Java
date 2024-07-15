public class LoopsDemo {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Nested For loops
        for (int i = 1; i <= 2; i++) {          // Outer loop
            System.out.println("Outer: " + i); // Executes 2 times

            for (int j = 1; j <= 3; j++) {      // Inner loop
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // For each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {  // Loops through elements in "cars" array
            System.out.println(i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}
