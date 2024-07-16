public class MethodsDemo {
    public static void main(String[] args) {
        // passing arguments in a method
        System.out.println("Sum: " + add(5, 3)); // integer

        System.out.println("Sum: " + add(5.43f, 3.24f)); // float

        System.out.println("Sum: " + add(5.10112, 3.20213)); // double

        // Method Scope: Variables declared directly inside a method are available anywhere in the method
        //               following the line of code in which they were declared

        // Code from here and above CANNOT use x
        int x = 100;
        // Code here and bellow can use x

        System.out.println(x);

        // Block Scope: A block of code refers to all of the code between curly braces {}.
        // Variables declared inside blocks of code are only accessible by the code between the curly braces,
        // Which follows the line in which the variable was declared
    }

    // Method to add two numbers
    public static int add(int a, int b) { // here int a and b are parameters
        return a + b; // return type is "int" so the method returns an integer value
    }

    // Method Overloading : multiple methods with the same name but different parameters
    public static float add(float a, float b){
        return a + b; // returning a float value
    }

    public static double add(double a, double b){
        return a + b; // returning a double value
    }
}
