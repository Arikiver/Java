// Recursion is the technique of making a function call itself.

public class RecursionDemo {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }

    // Halting Condition: recursive functions can run into the problem of infinite recursion
    // Infinite recursion is when the function never stops calling itself.
    // Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
    // In the above example, the halting condition is when the parameter k becomes 0.
}
