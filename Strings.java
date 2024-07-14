public class Strings {
    public static void main(String[] args) {
        System.out.println("There are different ways to print strings:");

        // 1. Simple string
        System.out.println("Hello, World!");

        // 2. Concatenating strings with the + operator
        String part1 = "Hello";
        String part2 = "World";
        System.out.println(part1 + ", " + part2 + "!");

        // 3. Using the String.format method
        String formattedString = String.format("This is a %s example", "formatted");
        System.out.println(formattedString);

        // 4. Using printf for formatted output
        int number = 42;
        System.out.printf("The answer is %d%n", number);

        // 5. Using StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("This is ");
        sb.append("an example ");
        sb.append("of StringBuilder.");
        System.out.println(sb.toString());

        // 6. Using String.join to join multiple strings
        String joinedString = String.join(" ", "This", "is", "a", "joined", "string.");
        System.out.println(joinedString);

        // 7. Printing strings with escape sequences
        System.out.println("This is a line break\nAnd this is a tab:\tTabbed text");

        // 8. Using the String.format method with different data types
        String name = "Alice";
        int age = 30;
        double salary = 12345.67;
        System.out.println(String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary));

        // 9. Printing characters
        char singleChar = 'A';
        System.out.println("Single character: " + singleChar);

        // 10. Using printf with various format specifiers
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        // 11. Printing boolean values
        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
