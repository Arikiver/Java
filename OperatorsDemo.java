public class OperatorsDemo {
    public static void main(String[] args) {
        // Variables for demonstration
        int a = 10;
        int b = 20;
        int c = 0;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus
        System.out.println();

        // 2. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();

        // 3. Logical Operators
        System.out.println("Logical Operators:");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
        System.out.println();

        // 4. Bitwise Operators
        System.out.println("Bitwise Operators:");
        int m = 5;  // 0101 in binary
        int n = 7;  // 0111 in binary
        System.out.println("m & n: " + (m & n)); // Bitwise AND
        System.out.println("m | n: " + (m | n)); // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n)); // Bitwise XOR
        System.out.println("~m: " + (~m));       // Bitwise NOT
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift
        System.out.println();

        // 5. Assignment Operators
        System.out.println("Assignment Operators:");
        c = a + b;
        System.out.println("c = a + b: " + c); // Assign result of a + b to c
        c += a; // c = c + a
        System.out.println("c += a: " + c); 
        c -= a; // c = c - a
        System.out.println("c -= a: " + c); 
        c *= a; // c = c * a
        System.out.println("c *= a: " + c); 
        c /= a; // c = c / a
        System.out.println("c /= a: " + c); 
        c %= a; // c = c % a
        System.out.println("c %= a: " + c); 
        System.out.println();

        // 6. Unary Operators
        System.out.println("Unary Operators:");
        int d = 10;
        System.out.println("d: " + d);       // Original value
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("d: " + d);       // After post-increment
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("d: " + d);       // After post-decrement
        System.out.println();

        // 7. Ternary Operator
        System.out.println("Ternary Operator:");
        int e = 10, f = 20;
        int result = (e > f) ? e : f; // If e is greater than f, result is e, else f
        System.out.println("Result of (e > f) ? e : f: " + result);
        System.out.println();
    }
}
