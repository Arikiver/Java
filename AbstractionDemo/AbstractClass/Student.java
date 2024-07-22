package AbstractionDemo.AbstractClass;

// Subclass (inherits from Main)
public class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
