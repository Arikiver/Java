public class BreakAndContinueDemo {
    public static void main(String[] args) {
        // Break: The break statement can be used to jump out of a loop or a switch statement.
        System.out.println("Break statement: ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
        }

        // Continue: The "continue" statement breaks one iteration (in the loop),
        //  if a specified condition occurs,
        //  and continues with the next iteration in the loop.
        System.out.println("Continue statement: ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
        }
    }
}
