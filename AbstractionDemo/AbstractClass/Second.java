package AbstractionDemo.AbstractClass;

public class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}

// you'll get a runtime error if u simply run this file.
// rather you'll have to compile the whole AbstractClass file and then run this code

// you can do this using the console/terminal using the following code:

// compile the directory from the console: javac AbstractionDemo/AbstractClass/*.java
// Run the code from the console: java AbstractionDemo.AbstractClass.Second