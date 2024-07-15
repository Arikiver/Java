/* in java there are 2 types of typecasting:
 * 1) widening casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

 * 2) narrowing casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
 */

public class TypeCastingDemo {
    public static void main(String[] args) {
        //widening casting
        System.out.println("this is widening casting");
        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic casting: int to double

        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0

        //narrowing casting
        System.out.println("this is narrowing casting");
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }
}
