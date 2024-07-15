public class ArraysDemo {
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Printing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Printing array length
        System.out.println(numbers.length);

        // Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
