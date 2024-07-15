//The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

public class MathDemo {
    public static void main(String[] args) {
        //Math.max(x,y)
        System.out.println("max value btw 5 and 10: "+Math.max(5, 10));

        //Math.min(x,y)
        System.out.println("min value btw 5 and 10: "+Math.min(5, 10));

        //Math.sqrt(x);
        System.out.println("sqrt of 64: "+Math.sqrt(64));

        //Math.abs(x)
        System.out.println("absolute(positive) value of -4.7: "+Math.abs(-4.7));

        //Random Numbers
        int randomNum = (int)(Math.random() * 101);  // int num btw 0 to 100
        System.out.println("random integer btw 0 and 100: "+randomNum);
        System.out.println("random double between 0 and 100: "+Math.random() * 101); //random method defaults to double
    }
}
