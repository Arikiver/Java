public class ClassesAndObjectsDemo {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("John", 25);

        // Accessing object properties and methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// Person class with properties and methods
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
